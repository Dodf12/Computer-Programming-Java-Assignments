import java.io.*;
import java.util.*;

/**
 * Chapter 41 - The Fantastic for Statement Exercises 1-2
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch41Ex1_2
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch41Ex1_2
{
    private Scanner scan;

    public Ch41Ex1_2()
    {
        scan = new Scanner( System.in );
    }

    /**
     * TODO Description
     * 
     * @ return number of years of supervision required by the sheep heard
     */
    public int sheepHerdSize()
    {
        int count = 0;
        double  N = 20;
        int c = 0;
        for (int t = 0; t<=25; t++){
            c++;
            double parenthesis = (Math.pow(0.83, t) * 10) + 1;
            N = 220/parenthesis;
            System.out.println(N);
            if (N<=80){
                count++;
            }
        }
        System.out.println(c);
        return count;
    }

    /**
     * TODO Description
     * 
     * @return the largest integer and sum of the specified range of values
     */
    public int[] maxIntsInFile( String fName, int numToRead ) throws FileNotFoundException
    {
        int sum = 0;
        int max = 0;

        try
        {
            if (new File( fName ).isFile())
            {
                scan = new Scanner( new File( fName ) ); // connect the Scanner to the file
            }
            else
            {
                scan = new Scanner( fName ); // connect the Scanner to the string
            }
        }
        catch ( IOException i )
        {
            System.out.println( "Error: " + i.getMessage() );
        }
        
        // TODO complete method

        for (int i = 0; i < numToRead; i++){
            int num = scan.nextInt();
            sum +=num;
            
            if (num> max){
                max = num;
            }
        }


        return new int[] { max, sum };
    }

    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method
     * 
     * @param args command line parameters (not used)
     * @throws FileNotFoundException
     */
    public static void main( String[] args ) throws FileNotFoundException
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch41Ex1_2 exercise = new Ch41Ex1_2();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Sheep Herd Size");
            System.out.println( "   (2) Maximum of Integers in a File");
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
                        System.out.println("The sheep heard must be supervised for "
                            + exercise.sheepHerdSize() + " years.");
                        break;
                    case '2':
                        System.out.print( "Enter name of the input file: " );
                        String fName = kbd.nextLine();
                        if (fName.length() <= 0)
                        {
                            fName = "ex1TestData.txt";
                        }

                        System.out.print( "Enter the number of integers to read: " );
                        int numToRead = kbd.nextInt();
                        kbd.nextLine();
                        int[] ret = exercise.maxIntsInFile(fName, numToRead);
                        System.out.println();
                        System.out.println("For the first " + numToRead
                            + " integers in the file:");
                        System.out.println("Max = " + ret[0]);
                        System.out.println("Sum = " + ret[1]);
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                            done = true;
                        else
                            System.out.print( "Invalid Choice" );
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
