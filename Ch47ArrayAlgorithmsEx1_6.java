import java.io.*;
	  	
 import java.util.Scanner;
 	  	
 /**
 5	  	
  * Chapter 47 Programming Exercises 1-6
 6	  	
  * 
 7	  	
  * @author TODO your name
 8	  	
  * @version TODO date
 9	  	
  * 
 10	  	
  * @author Period - TODO Your Period
 11	  	
  * @author Assignment - Ch47_ArrayAlgorithms
 12	  	
  * 
 13	  	
  * @author Sources - TODO list collaborators
 14	  	
  */
  	
 public class Ch47ArrayAlgorithmsEx1_6
   	
 {	  	
     Scanner scan;
  	

  	
 public int[] Ex2_TwoLargest( int[] data )
  	
 {
  	
     // declare and initialize variables for the two largest
  	
     int largest = 0;     
  	
     int nextLargest = 0;
  	

  	
     // compute the two largest
  	
     for ( int index = 0; index < data.length; index++ )
  	
     {
  	
         if (largest < data[index]){
  	
             largest = data[index];
  	
         }
  	
         else if (data[index] > nextLargest && data[index] < largest){
  	
             nextLargest = data[index];
  	
         }
  	
     }
  	

  	
     // return the two largest
  	
     return new int[] { largest, nextLargest };
  	
 }
  	

  	
 /**
  	
  * Method that computes and writes out the element in the data array that is
  	
  * closest to zero.
  	
  * 
  	
  * @param data  array of integers to evaluate
  	
  * @return value closest to zero in data
  	
  */
  	
 public int Ex3_NearlyZero( int[] data )
  	
 {
  	
     // declare and initialize variables
  	
     int nearest0 = Math.abs( data[0] );
	  	
     int dist_from_zero = 100;
	
     // find the element nearest to zero
	  	
     for ( int index = 1; index < data.length; index++ )
	  	
     {
	  	
         if ( nearest0 > Math.abs(data[index]))
	  	
         {
	  	
             nearest0 = data[index];
	  	
         }
	  	
     }
	  	

	  	
     return nearest0;
	  	
 }
	  	

	  	
 /**
	  	
  * Method that reverses the order of the values in data. Only the array that
	  	
  * is passed in used, no addition storage is created.
	  	
  * 
	  	
  * @param data  array of integers
	  	
  * @return data array with the order of the elements reversed
	  	
  */
	  	
 public void Ex4_ReverserVersion1( int[] data )
	  	
 {
	  	
     // reverse the data
	  	
     int temp = 0;
	  	
     for ( int j = 0; j < data.length/2 ; j++ )
	  	
     {
	  	
         temp = data[j];
	  	
         data[j] = data[data.length-j-1];
	  	
         data[data.length-j-1] = temp;
	  	
     }
	  	

	  	
     // write out the new data
	  	
     for ( int j = 0; j < data.length; j++ )
	  	
     {
	  	
         System.out.println(data[j]);
	  	
     }
	  	
 }
	  	

	  	
 /**
	  	
  * Method that reverses the order of the values in data. Only the array that
	  	
  * is passed in used, no addition storage is created.
	  	
  * 
	  	
  * @param data  array of integers
	  	
  * @return data array with the order of the elements reversed
	  	
  */
	  	
 public int[] Ex4_ReverserVersion2( int[] data )
	  	
 {
	  	
     int[] result = new int[14]; 
	  	

	  	
     // copy the data in reversed order to result
	  	
     for ( int j = 0; j < data.length; j++ )
	  	
     {
	  	
         int temp = data[j];
	  	
         result[data.length-j-1] = temp;
	  	
     }
	  	

	  	
     // write out the result
	  	
     for ( int j = 0; j < data.length; j++ )
	  	
     {
	  	
         System.out.println(result[j]);
	  	
     }
	  	

	  	
     return result;
	  	
 }
	  	

	  	
 /**
	  	
  * An audio signal is sometimes stored as a list of int values. The values
	  	
  * represent the intensity of the signal at successive time intervals. Of
	  	
  * course, in a program the signal is represented with an array.
	  	
  * 
	  	
  * Often a small amount of noise is included in the signal. Noise is usually
	  	
  * small, momentary changes in the signal level. An example is the "static"
	  	
  * that is heard in addition to the signal in AM radio.
	  	
  * 
	  	
  * Smoothing a signal removes some of the noise and improves the perceptual
	  	
  * quality of the signal. This exercise is to smooth the values in an
	  	
  * integer array.
	  	
  * 
	  	
  * Say that the original values are in the array "signal". Compute the
	  	
  * smoothed array by doing this: Each value smooth[n] is the average of
	  	
  * three values: signal[n-1], signal[n], and signal[n+1].
	  	
  * 
	  	
  * For the first element of smooth, average the first two elements of
	  	
  * signal. For the last element of smooth, average the last two elements of
	  	
  * signal.
	  	
  * 
	  	
  * Integer arithmetic for this so that the values in smooth are integers.
	  	
  * 
	  	
  * @param signal  array of signal values
	  	
  * @return array of "smoothed" values
	  	
  */
	  	
 public int[] Ex5_Smooth( int[] signal )
	  	
 {
	  	
     int[] smooth = new int[signal.length]; 
	  	

	  	
     // compute the smoothed value for each cell of the array smooth
	  	
     smooth[0] = (signal[0] + signal[1]) / 2;                 
	  	
     smooth[signal.length - 1] = ((signal[signal.length-1] + signal[signal.length-2]))/2; // TODO FIX THIS!!
	  	
     for ( int j = 1; j < smooth.length-1; j++ )
	  	
     {
	  	
 
	  	
         smooth[j] = (signal[j-1] + signal[j] + signal[j+1])/3;
	  	
     }
	  	

	  	
     // write out the result
	  	
     for ( int j = 0; j < smooth.length; j++ )
	  	
     {
	  	
       
	  	
         System.out.println(smooth[j]);
	  	
     }
	  	

	  	
     return smooth;
	  	
 }
	  	

	  	
 /**
	  	
  * A method that reads integer pH data into an array and compute the
	  	
  * average of all the data. The array is scanned again to find the
	  	
  * value that is farthest (in either direction) from the average.
	  	
  * A new average is evaluated that does not include this outlier value.
	  	
  * 
	  	
  * @param fileName name of file contain pH data
	  	
  * @return and array of doubles containing the average, the value most
	  	
  *         distant from the average and a resulting average of the
	  	
  *         array with the outlier removed respectively.
	  	
  * @throws IOException
	  	
  */
	  	
 public double[] Ex6_DataTweeker( String fileName ) throws IOException
	  	
 {
	  	
     // declare and initialize three sums
	  	
     double average = 0;
	  	
     double mostDistant=0;
	  	
     double newAverage = 0;
	  	
     double sum = 0;
	  	
     double distance = 0;
	  	
     
	  	
     File file = new File( fileName );   // create a File object
	  	
     Scanner scan = new Scanner( file ); // connect a Scanner to the file
	  	
     
	  	
     double[] data = new double[scan.nextInt()];     
	  	

	  	
     // TODO complete method
	  	
     for (int i=0; i<data.length;i++) {
	  	
         data[i] = scan.nextDouble();
	  	
         sum+=data[i];
	  	
     }
	  	
     average = sum/(data.length);
	  	
    
	  	
     int placeholder = 0;
	  	
     for (int j=0; j<data.length;j++) {
	  	
         if (Math.abs(data[j]-average)>distance) {
	  	
             distance = Math.abs(data[j]-average);
	  	
             mostDistant = data[j];
	  	
             placeholder = j;
	  	
      //       System.out.println(mostDistant);
	  	
      //       System.out.println(Math.abs(myarr[i]-average));          
	  	
         }
	  	
     } 
	  	
     for (int k=0; k<data.length;k++) {
	  	
         if (k!=placeholder){
	  	
             newAverage+=data[k];
	  	
         }
	  	
     }
	  	
     newAverage = newAverage/(data.length-1);
	  	
   //  System.out.println("average: " + average);
	  	
   //  System.out.println("most distant value: " + mostDistant);
	  	
    // System.out.println("new average: " + newAverage);
	  	
     scan.close();
	  	
     return new double[] { average, mostDistant, newAverage };
	  	
 }
	  	

	  	
 /**
	  	
  * Testing method: instantiates a Lesson15Exercises object and then invokes
	  	
  * each method
	  	
  * 
	  	
  * @param args
	  	
  *            command line parameters (not used)
	  	
  * @throws IOException
	  	
  */
	  	
 public static void main( String[] args ) throws IOException
	  	
 {
	  	
     Scanner kbd = new Scanner( System.in );
	  	
     boolean done = false;
	  	
     String separator = "";
	  	

	  	
     Ch47ArrayAlgorithmsEx1_6 exercise = new Ch47ArrayAlgorithmsEx1_6();
	  	

	  	
     do
	  	
     {
	  	
         System.out.println();
	  	
         System.out.println();
	  	
         System.out.println( "Make a selection" );
	  	
         System.out.println();
	  	
         System.out.println( "   (1) Sum of Even, Odd, and All Elements" );
	  	
         System.out.println( "   (2) Two Largest Elements" );
	  	
         System.out.println( "   (3) Closest to Zero" );
	  	
         System.out.println( "   (4) Reversal of Elements" );
	  	
         System.out.println( "   (5) Smooth Operator" );
	  	
         System.out.println( "   (6) Data Tweeker" );
	  	
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
	  	
                     int[] dataEx1 = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };
	  	

	  	
                     int[] threeSums = exercise.Ex1_ThreeSums( dataEx1 );
	  	

	  	
                     separator = "";
	  	
                     System.out.print( "data = (" );
	  	
                     for ( int item : dataEx1 )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = ", ";
	  	
                     }
	  	
                     System.out.println( "}" );
	  	

	  	
                     System.out.println( "Sum of evens = " + threeSums[0] );
	  	
                     System.out.println( "Sum of odds = " + threeSums[1] );
	  	
                     System.out.println( "Sum of all = " + threeSums[2] );
	  	
                     break;
	  	
                 case '2':
	  	
                     int[] dataEx2 = { 3, 1, 5, 7, 4, 12, -3, 8, -2 };
	  	

	  	
                     int[] twoLargest = exercise.Ex2_TwoLargest( dataEx2 );
	  	

	  	
                     separator = "";
	  	
                     System.out.print( "data = (" );
	  	
                     for ( int item : dataEx2 )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = ", ";
	  	
                     }
	  	
                     System.out.println( "}" );
	  	

	  	
                     System.out.println( "largest = " + twoLargest[0] );
	  	
                     System.out.println( "next largest = " + twoLargest[1] );
	  	
                     break;
	  	
                 case '3':
	  	
                     int[] dataEx3 = { 3, 1, 5, 7, 4, 12, -3, 8, -2 };
	  	

	  	
                     int closestTo0 = exercise.Ex3_NearlyZero( dataEx3 );
	  	

	  	
                     separator = "";
	  	
                     System.out.print( "data = (" );
	  	
                     for ( int item : dataEx3 )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = ", ";
	  	
                     }
	  	
                     System.out.println( "}" );
	  	

	  	
                     System.out.println( "Value closest to zero = "
	  	
                         + closestTo0 );
	  	
                     break;
	  	
                 case '4':
	  	
                     int[] dataEx4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
	  	
                         12, 13, 14 };
	  	

	  	
                     System.out.println( "Part a (same array):" );
	  	
                     separator = "";
	  	
                     System.out.print( "original data = (" );
	  	
                     for ( int item : dataEx4 )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = ", ";
	  	
                     }
	  	
                     System.out.println( "}" );
	  	

	  	
                     exercise.Ex4_ReverserVersion1( dataEx4 );
	  	
                     separator = "";
	  	
                     System.out.print( "reversed data = (" );
	  	
                     for ( int item : dataEx4 )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = ", ";
	  	
                     }
	  	
                     System.out.println( "}" );
	  	
                     System.out.println();
	  	

	  	
                     int[] reversed = exercise.Ex4_ReverserVersion2( dataEx4 );
	  	
                     System.out.println( "Part b (different array):" );
	  	
                     separator = "";
	  	
                     System.out.print( "original data = (" );
	  	
                     for ( int item : dataEx4 )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = ", ";
	  	
                     }
	  	
                     System.out.println( "}" );
	  	

	  	
                     separator = "";
	  	
                     System.out.print( "reversed data = (" );
	  	
                     for ( int item : reversed )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = ", ";
	  	
                     }
	  	
                     System.out.println( "}" );
	  	
                     break;
	  	
                 case '5':
	  	
                     int[] signal = { 1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4 };
	  	

	  	
                     int[] smooth = exercise.Ex5_Smooth( signal );
	  	
                     separator = "";
	  	
                     System.out.print( "signal: " );
	  	
                     for ( int item : signal )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = " ";
	  	
                     }
	  	
                     System.out.println();
	  	

	  	
                     separator = "";
	  	
                     System.out.print( "smooth: " );
	  	
                     for ( int item : smooth )
	  	
                     {
	  	
                         System.out.print( separator + item );
	  	
                         separator = " ";
	  	
                     }
	  	
                     System.out.println();
	  	
                     break;
	  	
                 case '6':
	  	
                     System.out.print( "Enter name of the input file: " );
	  	
                     String fName = kbd.nextLine();
	  	
                     if ( fName.length() <= 0 )
	  	
                     {
	  	
                         fName = "ph.txt";
	  	
                     }
	  	

	  	
                     double[] ret = exercise.Ex6_DataTweeker( fName );
	  	
                     System.out.println( "Average = " + ret[0] );
	  	
                     System.out.println( "Most Distant = " + ret[1] );
	  	
                     System.out.println( "New Average = " + ret[2] );
	  	
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
