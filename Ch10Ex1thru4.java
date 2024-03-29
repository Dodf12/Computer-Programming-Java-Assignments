import java.util.Scanner;

/**
    TODO Write a one-sentence summary of your class here.
    TODO Follow it with additional details about its purpose, what abstraction
    it represents, and how to use it.
    
    @author  TODO Your Name
    @version TODO the date
    
    @author   Period - TODO Your Period
    @author   Assignment - Ch10_IO
    
    @author   Sources - TODO list collaborators
 */
public class Ch10Ex1thru4
{
    Scanner scan;

    /**
     *  Constructs a Scanner for input from the console.
     */
    public Ch10Ex1thru4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * @param str input for the various methods
     */
    public Ch10Ex1thru4( String str )
    {
        scan = new Scanner( str );
    }

    /**
      TODO Description
     */
    public void areaOfACircle()
    {   
        System.out.print("Input the radius: ");
        int radius = scan.nextInt();
        double area = Math.PI * Math.pow(radius, 2.0);
        System.out.println("The radius is: "+ radius + " The area is: " + area);

    }

    /**
      TODO Description
     */
    public void centsToDollars()
    {
        System.out.println("Input the cents: ");
        int cents = scan.nextInt();


        int dollars = cents / 100;
        cents = cents % 100;

        System.out.println("That is " + dollars+ " dollars and " + cents + "cents.");


    }

    /**
      TODO Description
     */
    public void correctChange()
    {
        int cents = scan.nextInt();
        int dollar = cents / 100;
        cents = cents - 100*dollar;

        int quarters= cents / 25;
        cents = cents - 25*quarters;

        int dimes= cents / 10;
        cents = cents - 10*dimes;

        int nickels = cents / 5;
        cents = cents - 5*nickels;
        
        System.out.println("Your change is: "+dollar+" dollar, "+quarters + " quarters, " +  dimes + " dimes, " + nickels + " nickels, and" + cents + " cents");
    }

    /**
      TODO Description
     */
    public void ohmsLaw()
    {
        System.out.println("Input voltage: ");
        int voltage= scan.nextInt();
        double amps;
        System.out.println("Input resistance: ");
        int resistance= scan.nextInt();

        amps = (voltage + 0.0) / resistance;

        System.out.println(amps);


    }

    /**
      Testing method: instantiates a Lesson10Exercises object and then invokes
      each method.

      @param args  command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch10Ex1thru4 exercise = new Ch10Ex1thru4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Area of a Circle" );
            System.out.println( "    (2) Cents to Dollars" );
            System.out.println( "    (3) Correct Change" );
            System.out.println( "    (4) Ohm's Law" );
            System.out.println( "    (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.areaOfACircle();
                        break;
                    case '2':
                        exercise.centsToDollars();
                        break;
                    case '3':
                        exercise.correctChange();
                        break;
                    case '4':
                        exercise.ohmsLaw();
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
