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
        // TODO Your code goes here
    }
    
    /**
     * TODO Description
     */   
    public void furtherImprovedGuessingGame()
    {
        // TODO Your code goes here
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
