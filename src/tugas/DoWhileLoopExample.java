/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

/**
 *
 * @author User
 */
public class DoWhileLoopExample {
    public static void main(String args[])
    {
        int i=10;
        do{
            System.out.println(i);
        }
        while(i>4);
    }
}

class DoWhileLoopExample2 {
    public static void main(String args[])
    {
        int[] arr = {2,11,45,9};
        int i=0;
        do
        {
            System.out.println(arr[i]);
            i++;
        }
        while(i<4);
    }
}
