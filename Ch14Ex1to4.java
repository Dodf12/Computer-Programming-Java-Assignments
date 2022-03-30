import java.util.*;

/**
 * Chapter 14 - Boolean Expressions Programming Exercises 1-4.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch14Ex1to4
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch14Ex1to4
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch14Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch14Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * TODO Description
     */
    public void checkCharge()
    {
        System.out.println("Enter the amount in checkings account ");
        double checkings = scan.nextDouble();

        System.out.println("Enter the amount in savings account ");
        double savings = scan.nextDouble();

        if (checkings > 1000.00 || savings >1500.00 ) {
                System.out.println(0.0);
        }
        else {
            System.out.println(0.15);
        }

    }
    /**
     * TODO Description
     */
    public void tirePressure()
    {
        System.out.println("Input right front pressure");
        int right_front_pressure = scan.nextInt();
        
        System.out.println("Input left front pressure");
        int left_front_pressure = scan.nextInt();

        System.out.println("Input right rear pressure");
        int right_rear_pressure = scan.nextInt();

        System.out.println("Input left rear pressure");
        int left_rear_pressure = scan.nextInt();
        
        if ( (right_front_pressure == left_front_pressure) && (right_rear_pressure == left_rear_pressure) ) 
            {
                System.out.println("OK");
            }
        else {
            System.out.println("BAD");
        }
    }

    /**
     * TODO Description
     */
    public void moreTirePressure()
    {
        int warning = 0;
        System.out.println("Input right front pressure");
        int right_front_pressure = scan.nextInt();

        if (right_front_pressure < 35 || right_front_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }
        
        System.out.println("Input left front pressure");
        int left_front_pressure = scan.nextInt();
        if (left_front_pressure < 35 || left_front_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }

        System.out.println("Input right rear pressure");
        int right_rear_pressure = scan.nextInt();
        if (right_rear_pressure < 35 || right_rear_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }

        System.out.println("Input left rear pressure");
        int left_rear_pressure = scan.nextInt();
        if (left_rear_pressure < 35 || left_rear_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }
        
        if (warning ==0 ) 
            {
                System.out.println("OK");
            }
        else {
            System.out.println("BAD");
        }

    }

    /**
     * TODO Description
     */
    public void pressureIsBuilding()
    {
        int warning = 0;
        int three_psi=0;
        System.out.println("Input right front pressure");
        int right_front_pressure = scan.nextInt();

        if (right_front_pressure < 35 || right_front_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }
        
        System.out.println("Input left front pressure");
        int left_front_pressure = scan.nextInt();
        if (left_front_pressure < 35 || left_front_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }

        if (warning == 0) {
            if( -4 < right_front_pressure- left_front_pressure  && right_front_pressure- left_front_pressure < 4) {
                three_psi++;
            }
           
        }

        System.out.println("Input right rear pressure");
        int right_rear_pressure = scan.nextInt();
        if (right_rear_pressure < 35 || right_rear_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }

        System.out.println("Input left rear pressure");
        int left_rear_pressure = scan.nextInt();
        if (left_rear_pressure < 35 || left_rear_pressure > 45) {
            System.out.println("Warning: pressure is out of range");
            warning++;
        }

        if (warning == 0) {
            if( -4 < right_rear_pressure- left_front_pressure  && right_rear_pressure- left_front_pressure < 4) {
                three_psi++;
            }
        
        if (warning ==0 ) 
            {
                System.out.println("OK");
            }
        else {
            System.out.println("BAD");
        }
    }
}

    /**
     * Testing method: instantiates a Ch14Ex1to4 object and then
     * invokes each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch14Ex1to4 exercise = new Ch14Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Check Charge" );
            System.out.println( "   (2) Tire Pressure" );
            System.out.println( "   (3) More Tire Pressure" );
            System.out.println( "   (4) The Pressure is Building" );
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
                        exercise.checkCharge();
                        break;
                    case '2':
                        exercise.tirePressure();
                        break;
                    case '3':
                        exercise.moreTirePressure();
                        break;
                    case '4':
                        exercise.pressureIsBuilding();
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
