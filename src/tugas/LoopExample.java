/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

/**
 *
 * @author User
 */
public class LoopExample {
    public static void main(String args[])
    {
        for(int i=10; i>1; i--)
        {
            System.out.println("The value of i is :"+i);
        }
    }
}

//infinite
class LoopExample2{
    public static void main(String args[])
    {
        for(int j=1; j>=1; j++)
        {
            System.out.println("The value of j is :"+j);
        }
    }
}

class LoopExample3{
    public static void main(String args[])
    {
        int[] arr = {2,11,45,9};
        for(int j=0; j<4; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
