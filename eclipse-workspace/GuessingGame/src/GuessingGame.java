import java.util.Random;
import java.util.Scanner;
/**
 * 
 * Guessing game. A Random number is generated and user tries to guess the number. 
 * Hints are given to help user and counter is used to track the number of guesses.
 * @author qqdipps
 *
 */
public class GuessingGame {

    /**
    * A random number generator method
    * @return a random integer between 0 and 100
    */
    public static int getRandomNum() {
        int min = 0;
        int max = 100;
        System.out.println("Guess a number between " + min + " and " + max);
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }
    
    static int count = 0; // intialize count value
   	static int recordCount=100; // intialize recordCount for record keeping
 
    
    public static void main(String[] args) {   
    	
    	/**
    	 * variable play used to continue or quite game
    	 */
    	String play = "Y"; // intialize play
    	
    	/**
    	 * equals method used in while loop to continue or quite game
    	 */
    	while (play.equalsIgnoreCase( "Y")) { //while loop to restart game, not case sensitive		
	    	count = 0; //reset counter
	        int num = getRandomNum(); //our random number
	        Scanner in = new Scanner(System.in); // scanner 
	        int guess = -1; // intialize guess value
	     
	       /** 
	        * While loop used to iterate user input and statements to giver user hints
	        * to guess the correct number while guess does not equal to number
	        */
	       while (guess != num) {
	        guess = in.nextInt(); // user input
	        	++count; //counter increments
	  
	        	if (guess < num) {      //checks if guess is less than number
	        		System.out.println("You need to guess Higher!!"); //statement response
	        		
	        		if (guess/2 < num && num-guess > 20) { //checks if guess is "way" less than number, return hint
	        			System.out.println("Way Higher!!"); //hint
	        		}
	        		
	        		System.out.println("Try guessing again: "); //prompt for user input
	        	}
	        	
	        	else if (guess > num) { // checks if guess is more than  number
	        		System.out.println("You need to guess Lower!!"); //hint
	        	
	        		if (guess/2 > num && guess-num > 20) { //checks if guess is "way" more than number
	        			System.out.println("Way Lower!!!" );//hint
	        		}
	        		System.out.println("Try guessing again: "); //prompt for user input
	        	}
	        }
	     
	       	System.out.println("Wowza! Great job! You guessed correctly in " + count + " tries." ); //winning statement
	       	recordGuesses();//keeps record of lowest guess 	
	      	System.out.println("Play Again? Y/N"); // play again?
	       	Scanner playAgain = new Scanner(System.in); //set up scanner
	       	play = playAgain.nextLine(); // user input as string
	       	play = play.substring(0,1); // in case user inputs yes or no
    	}
    
    	System.out.println("OK, well thanks for playing.");  // end statement if user doesn't want to play again
    }
	
    /**
	 * method keeps count of record guesses, lowest is best
	 */
   	public static void recordGuesses() {
	   	if (recordCount > count) {  // compares record count to current count
	   		System.out.println("That's a new record! Try and beat it!"); //new record statement
	   		recordCount = count; //sets new record
	   	}
	   	else {
	   		System.out.println("Try and beat your record of " + recordCount + " guesses!"); //repeat record statement
	   	}
	   	
	}
}

 