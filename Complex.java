/**
   Complex - a basic class that represents a complex number a + bi where a and b are integers

   @author  TODO Your Name
   @version TODO Date

   @author  Period - TODO Your Period
   @author  Assignment - Complex

   @author  Sources - TODO list collaborators
 */
public class Complex {
	
    /**
     * Constructor
     * 
     * @param r - real component 
     * @param i - imag component 
     */
	// TODO
    private int real;
    private int imag;
    public Complex(int r, int i)
    {
        real = r;
        imag = i;
    } 

    public int getReal()
    {
        return real;
    }

    public int getImag()
    {
        return imag;
    }

    public double magnitude()
    {
        return Math.sqrt(Math.pow(real,real) + Math.pow(imag,imag));
    }

    public Complex conjugate()
    {
        Complex conjugate = new Complex(real, -imag);
        return conjugate;
    }

    public String toString()
    {
        if(imag == 0) //If just real numebr
        {
            return "" + real + "";
        }
        else if (real > 0 && imag > 0) //Both are positive
        {
            return ""+ real + "+" + imag + "i";
        }
        
        else if(real>0 && imag < 0) //The imag part is negative
        {
            return ""+ real + "-" + imag + "i";
        }

        else if(real<0 && imag > 0) //The the real is negative
        {
            return "-"+ real + "+" + imag + "i";
        }

        else if(real<0 && imag < 0) //Both are negative
        {
            return "-"+ real + "-" + imag + "i";
        }

        else if(real ==0)
        {
            if (imag>0)
            {
                return "" + imag +"i";
            }
            else if(imag<0)
            {
                return "-" + imag +"i"; 
            }
        }
        
        return "0";




    }

    public Complex add(Complex other)
    {
        int new_real = this.real + other.real;
        int new_imag = this.imag + other.imag;
        Complex add = new Complex(new_real, new_imag);
        return add; 
    }

    public static void main(String[] args)
    {
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(6,10);
        
        double m1 = c1.magnitude();
        Complex c3 = c2.conjugate();
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(c3);


    }


    /**
     * Gets the real component
     * 
     * @return real 
     */
	// TODO

	
    /**
     * Gets the real component
     * 
     * @return imag 
     */
	// TODO

	
    /**
     * Calculates the magnitude of the complex number
     * 
     * @return magnutude - sqrt(r^2 + i^2) 
     */
	// TODO

	
    /**
     * Generate the conjugate of the number
     * 
     * @return conjugate 
     */
	// TODO

	
    /**
     * Adds two complex numbers
     * 
     * @return sum of two numbers 
     */
	// TODO
	

    /**
     * For System.out.println() support
     * 
     * Ex. 3 + 4i
     *     3
     *     -5i
     *     -2 - 6i
     * 
     * @return nicely formatted complex number
     */
	// TODO


}
