import java.util.*;


/**
 * Chapter 13 - Single-branch if Statements Programming Exercises 1-4
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch13Ex1to4
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch13Ex1to4
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch13Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch13Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * TODO Description
     */
    public void internetDelicatessen()
    {
        // TODO Your code goes here
        System.out.println("Enter the item: ");
        String item;
        item = scan.nextLine();

        System.out.println("Enter the price: ");
        int price;
        price = scan.nextLine();

    }

    /**
     * TODO Description
     */
    public void steamEngineEfficiency()
    {
        // TODO Your code goes here
    }

    /**
     * TODO Description
     */
    public void microwaveOven()
    {
        // TODO Your code goes here
    }

    /**
     * TODO Description
     */
    public void fantasyGame()
    {
        // TODO Your code goes here
    }

    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch13Ex1to4 exercise = new Ch13Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Internet Delicatessen" );
            System.out.println( "   (2) Steam Engine Efficiency" );
            System.out.println( "   (3) Microwave Oven" );
            System.out.println( "   (4) Fantasy Game" );
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
                        exercise.internetDelicatessen();
                        break;
                    case '2':
                        exercise.steamEngineEfficiency();
                        break;
                    case '3':
                        exercise.microwaveOven();
                        break;
                    case '4':
                        exercise.fantasyGame();
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
