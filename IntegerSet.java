import java.util.*;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Your Name
   @version TODO date

   @author  Period - TODO Your Period
   @author  Assignment - Ch54 IntegerSet

   @author  Sources - TODO list collaborators
 */
public class IntegerSet { 

    private ArrayList<Integer> set;

    /* construct a new empty IntegerSet object */
    public IntegerSet() {
        set = new ArrayList<Integer>();
    }

    /* utility method: return size of set */
    public int size() {

        return set.size();

    }

    /* 
    * @param True if k is in the set
    */
    public boolean contains(int k) {
        int count = 0;
        for(int i=0; i<set.size();i++)
        {
            if (set.get(i) == k)
            {
                count++;
            }

        }

        if (count == 0)
        {
            return false;
        }

        return true;
      

    }

    /** 
     * add the num into the set but only if it is not already in the set
     * @return True if number was added to the set; False if it did not need to be added
    */ 
    public boolean add(int num) {
        
        int count = 0;
        for(int i=0; i<set.size();i++)
        {
            if (set.get(i) == num
            {
                count++;
            }

        }

        if(count == 0)
        {
            return count;
        }
    }

    /* add elements from Array nums to set
    * @param nums array of integers to add to the list
    * @return count of elements successfully added
    * postcondition: set has no duplicates (do not add duplicates)
    */
    public int addFromArray(int [] nums) {

        // TODO
    
    }

    /**
     * @param return a string that looks like {1 2 3}
     * don't worry about the spaces as long as there is a space between the numbers
     * there can be extra spaces before or after the { }
     */
    public String toString() {
        String s = "{";

        // TODO - concatenate all the number of the set into the string s

        s = s + "}";

        return s;
    }

    public static void main (String[] args) {

        IntegerSet s = new IntegerSet();

        System.out.println("Initial size is " + s.size());

        System.out.println("Found a 6 in the list: " + s.contains(6));
        
        s.add(2);
        s.add(6);
        s.add(8);
        s.add(2);
        s.add(6);
        s.add(0);
        System.out.println(s);

        System.out.println("Size is now: " + s.size());         // should be 4

        System.out.println("Adding another 0: " + s.add(0));
        System.out.println("Adding a 10: " + s.add(10));

        System.out.println("Size is now: " + s.size());         // should be 5

        s = new IntegerSet();
        int[] n = {2, 6, 8, 2, 6, 0};
        int numAdded = s.addFromArray(n);
        System.out.println("Size of new set from addFromArray: " + numAdded);   // should be 4

        System.out.println(s);

    }
}
