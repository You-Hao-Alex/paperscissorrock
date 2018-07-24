import java.io.BufferedReader;
import java.io.InputStreamReader;
// import statements

/**
 * The Game program implements an application that
 * plays the game 'paper, scissors, rock' with a user.
 * @author       You Hao
 * @version      1.0
 * @since        2016-08-19
 */
public class Game {
	/**
	 * The number of how many rounds of the game have been played.
	 */
	public int numRounds = 1;
	/**
	 * The number of how many rounds of the game have been won by the human player.
	 */
    public int roundsWon = 0;	
    /**
     * This is the main method which makes use of playGAME method.
     */
    public static void main(String[] args) {
    	Game game =new Game();
    	game.playGAME();	
    }
    
    /**
     * This method is used to play the game.
     * It will ask the user how many rounds to play and then play that many rounds.
     * Variables numRounds and roundsWon will be updated. 
     */
    public void playGAME() {
    	int i,p;
    	String st;
    	/**
    	 * Asking the user how many rounds to play.
    	 */
    	BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("How many rounds do you want to play?"+"\n");
    		/**
    		 * Capturing error input 
    		 */
    		while (true) {
    			try {
    				st = a.readLine();
 	                i = Integer.parseInt(st);
 	                	if (i <= 0) {
 	                		System.out.println("You must enter a positive integer, please enter again: ");
 	                		continue;
 	                		}
 	                 	break;
 	                 	}
 	             catch (Exception e) {
 	            	 System.out.println("You must enter a positive integer, please enter again: ");
 	            	 }
    			}
    		
    		/**
    		 * Asking the human user to input his choice. 
    		 */
    		do {
    			System.out.println("Round: " + numRounds);
    			System.out.print("Enter 0, 1 or 2 for paper, scissors, rock： " + "\n");
    			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    			/**
    			 * Capturing the error input
    			 */
    			while (true) {
    				try {
    					st = in.readLine();
    					p = Integer.parseInt(st);
    					if (p != 0 && p != 1 && p != 2) {
    						System.out.println("You must enter 0, 1 or 2, please enter again: ");
    						continue;
    						}
    					break;
    					}
    				catch (Exception e) {
    					System.out.println("You must enter 0, 1 or 2, please enter again: ");
    					}
    				}
    			/**
    			 * Generating a random choice from computer.
    			 */
    			int c = (int)(Math.random()*3);
    			String c_do = "paper";
    			String p_do = "rock";
    			switch (c) {
    			case 0:
    				c_do = "paper";
    				break;
    			case 1: 
    				c_do = "scissors";
    				break;
    			case 2:
    				c_do = "rock";
    				break;
    				}
    			
    			switch (p) {
    			case 0:
    				p_do = "paper";
    				break;
    			case 1:
    				p_do = "scissors";
    				break;
    			case 2:
    				p_do = "rock";
    				break;
    				}
    			
    			/**
    			 * Finding the result.
    			 */
    			if (p_do == "paper") {
	            if (c_do == "paper") {
	            	System.out.println("Computer Choice: 0"+"\n"+"\n");
	            	System.out.println("My choice was: 0");
	                System.out.println("A draw");
	                }
	            else if (c_do == "scissors") {
	            	System.out.println("Computer Choice: 1"+"\n"+"\n");
	            	System.out.println("My choice was: 0");
	            	System.out.println("scissors cut paper: Computer win");
	            	numRounds=numRounds+1;
	            	}
	            else {
	            	System.out.println("Computer Choice: 2"+"\n"+"\n");
	            	System.out.println("My choice was: 0");
	            	System.out.println("paper wraps rock: I win");
	            	roundsWon=roundsWon + 1;
	            	numRounds=numRounds + 1;
	            	}
	            }
    			else if (p_do == "scissors") {
    				if (c_do == "scissors") {
    					System.out.println("Computer Choice: 1"+"\n"+"\n");
    					System.out.println("My choice was: 1");
    					System.out.println("A draw");
    					}
    				else if (c_do == "rock") {
    					System.out.println("Computer Choice: 2"+"\n"+"\n");
    					System.out.println("My choice was: 1");
    					System.out.println("rock blunts scissors: Computer win");
    					numRounds = numRounds + 1;
    					}
    				else {
    					System.out.println("Computer Choice: 0"+"\n"+"\n");
    					System.out.println("My choice was: 1");
    					System.out.println("scissors cut paper: I win");
    					roundsWon = roundsWon + 1;
    					numRounds = numRounds + 1;
    					}
    				}
    			else {
    				if (c_do == "rock") {
    					System.out.println("Computer Choice: 2"+"\n"+"\n");
    					System.out.println("My choice was: 2");
    					System.out.println("A draw");
    					}
	            else if (c_do == "paper") {
	            	System.out.println("Computer Choice: 0"+"\n"+"\n");
	            	System.out.println("My choice was: 2");
	            	System.out.println("paper wraps rock: Computer win");
	            	numRounds = numRounds + 1;
	            	}
	            else {
	            	System.out.println("Computer Choice: 1"+"\n"+"\n");
	            	System.out.println("My choice was: 2");
	            	System.out.println("rock blunts scissors: I win");
	            	roundsWon = roundsWon + 1;
	            	numRounds = numRounds + 1;
	            	}
    				}
    			System.out.println("Won: " + roundsWon);
    			System.out.println("---------------------");
    			}
    		while(numRounds<=i);
    		}
    }
    	
	
	
