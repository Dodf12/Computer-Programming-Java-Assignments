import java.util.*;
  	
 /**
 	
  * Chapter 15 to 20
 	
  * Selected problems with while loops and random number generation
 
  * 
 
  * @author TODO Your Name
 
  * @version TODO Date
 	
  * @author Period - TODO Your Period
 
  * @author Assignment - Ch15Ex1to3
 	
  * @author Sources - TODO list collaborators
 	
  */
 	

 	
public class Ch15to20PS
	
{	  	
    Scanner scan;
 	
    Random rand = new Random();
/**
 	
 * Constructs a Scanner for input from the console.
 	
 */
 	
public Ch15to20PS()	
{
   scan = new Scanner( System.in );
 	
}
 	
/**
 	
 * Constructs a Scanner to evaluate passed input (used for testing).
 	
 * 
 	
 * @param str  input for the various methods
 	
 */
 	
public Ch15to20PS( String str )
 	
{
 	
    scan = new Scanner( str );
 	
}
 	

 	
/**
 	
 * Constructs a Scanner to evaluate passed input (used for testing).
 	
 * 
 	
 * @param str  input for the various methods
 	
 * @param seed  seed to use for random number generator
 	
 */    
 	
public Ch15to20PS( String str, long seed )
 	
{
 	
    scan = new Scanner( str );
 	
    rand.setSeed( seed );
 	
}
 	
 	
/**
 	
 * TODO Description
 	
 */
 	
public void repeatWord()
 	
{
 	
    // TODO Your code goes here
 	
    System.out.println("Enter a word: ");
 	
    String input_str = scan.nextLine();
 	
    System.out.println("                ");
 	
    int times = input_str.length();
 	
 	
    for (int i = 0; i<times; i++) {
 	
        System.out.println(input_str);
 	
    }
 	
 	
}
 	
 	
/**
 	
 * TODO Description
 	
 */
 	
public void shippingCostCalc()
 	
{
 	
    int pounds = 1;
 	
    while (pounds > 0) {
 	
        System.out.println("Weight of Order: ");
 	
        pounds= scan.nextInt();
 	
 	
        if (pounds == 0) {
 	
            System.out.println("bye");
 	
            break;
 	
        }
 	
        double shipping_cost = 3.00;
 	
        
 	
        if (pounds<=10){
 	
            System.out.println(shipping_cost);
 	
        }
 	
 	
        else {
 	
            shipping_cost = shipping_cost + (pounds-10)*0.25;
 	
            System.out.println("Shipping Cost: $" + shipping_cost);
 	
        }
 	
    }
 	
 	
 	
}
 	

 	
/**
 	
 * TODO Description
 	
 */
 	
public void randomWalk2D()
 	
{	  	
    double X = 0.0;	  	
    double Y = 0.0;	  	
    System.out.println("How many iterations? ");	  	
    int loop_Var = scan.nextInt();	  		  	
    // System.out.println((rand.nextDouble()*2) -1);	  	
    // System.out.println((rand.nextDouble()*2) -1);	  		  	
    for (int i=0; i<loop_Var; i++){	  	
        X = X + (rand.nextDouble()*2) -1;	  	
        Y = Y + (rand.nextDouble()*2)-1;	  	
        // System.out.println((rand.nextDouble()*2) -1);	  	
        // System.out.println((rand.nextDouble()*2) -1);	  		  	
    }	  	
    System.out.println("After "+loop_Var+" moves");	  	
    System.out.println("X is now at: " + X);	  	
    System.out.println("Y is now at: " + Y);	  	
    	  	
    double dist = Math.pow(X, 2) + Math.pow(Y, 2);	  	
    double distance = Math.sqrt(dist);	  		  	
    System.out.println("Distance from origin is "+ distance);	  		  	
}	  		  	
	  	
/**	  	
 * TODO Description	  	
 */   	  	
public void furtherImprovedGuessingGame()	  	
{	  	
    int rounds_won = 0;	  	
    for (int i = 1; i<=10; i++){	  	
        System.out.println("");	  	
        int rand_int = rand.nextInt(10)+1;	  	
        System.out.println(rand_int);	  	
        System.out.println("I am thinking of a number between 1 and 10");	  	
        System.out.println("Round " + i);	  		  	
        for (int j = 0; j<3;j++) {	  	
            	  	
            System.out.println("Enter guess: ");	  	
            int guess = scan.nextInt();	  	
            if (guess == rand_int+3 || guess == rand_int-3){	  	
                System.out.println("Cold");	  	
            }	  	
            else if (guess == rand_int+2 || guess == rand_int-2){	  	
                System.out.println("Warm");	  	
            }	  	
            else if (guess == rand_int+1 || guess == rand_int-1){	  	
                System.out.println("Hot");	  	
            }	  		  	
            else if (guess == rand_int) {	  	
                System.out.println("RIGHT!");	  	
                rounds_won = rounds_won+1;	  	
                System.out.println("You have won "+ rounds_won + " out of "+ i + " rounds ");	  	
                break;	  	
            }	  	
        }	  	
        System.out.println("wrong");	  	
        System.out.println("The correct number was "+rand_int);	  	
        System.out.println("You have won "+ rounds_won + " out of "+ i + " rounds ");	  		  		  	
    }	  	
    if (rounds_won <= 7) {	  	
        System.out.println("amateur");	  	
    }	  	
    else if (rounds_won == 8) {	  	
        System.out.println("advanced");	  	
    }	  	
    else if (rounds_won == 9) {	  	
        System.out.println("professional");	  	
    }	  	
    else if (rounds_won == 10) {	  	
        System.out.println("hacker");	  	
    }	  		  	
}	  		  	
/**	  	
 * Testing method: instantiates a Ch15to20PS object and then invokes	  	
 * each method.	  	
 * 	  	
 * @param args  command line parameters (not used)	  	
 */	  	
public static void main( String[] args )	  	
{	  	
    Scanner kbd = new Scanner( System.in );	  	
    boolean done = false;	  		  	
    Ch15to20PS exercise = new Ch15to20PS();	  		  	
    do	  	
    {	  	
        System.out.println();	  	
        System.out.println();	  	
        System.out.println( "Make a selection" );	  	
        System.out.println();	  	
        System.out.println( "   (1) Repeat Word" );	  	
        System.out.println( "   (2) Shipping Cost Calculator" );	  	
        System.out.println( "   (3) randomWalk2D" );	  	
        System.out.println( "   (4) Further Improved Guessing Game" );	  	
        System.out.println( "   (Q) Quit" );	  	
        System.out.println();	  	
        System.out.print( "Enter a choice:  " );	  	
        String response = kbd.nextLine();	  		  	
        if ( response.length() > 0 )	  	
        {	  	
            System.out.println();	  		  	
            switch ( response.charAt( 0 ) )	  	
            {	  	
                case '1':	  	
                    exercise.repeatWord();	  	
                    break;	  	
                case '2':	  	
                    exercise.shippingCostCalc();	  	
                    break;	  	
                case '3':	  	
                    exercise.randomWalk2D();	  	
                    break;	  	
                case '4':	  	
                    exercise.furtherImprovedGuessingGame();	  	
                    break;	  	
                default:	  	
                    if ( response.toLowerCase().charAt( 0 ) == 'q' )	  	
                    {	  	
                        done = true;	  	
                    }	  	
                    else	  	
                    {	  	
                        System.out.print( "Invalid Choice" );	  	
                    }	  	
                    break;	  	
            }	  	
        }
     } while ( !done );
 	
    System.out.println( "Goodbye!" );	  	
    }	  	
}
