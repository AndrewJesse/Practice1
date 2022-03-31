import java.util.*;
public class App
{
    // instance variables - replace the example below with your own
    private int[] x;

    /**
     * Constructor for objects of class App
     */
    public App()
    {
        x = new int[4];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        // put your code here
        System.out.println(Arrays.toString(x));
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        System.out.println("CHANGED AGAIN You entered: "+ i);
    }

}
