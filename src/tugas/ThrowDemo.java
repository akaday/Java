/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

/**
 *
 * @author User
 */
public class ThrowDemo {

    public static void main(String args[])
    {
        try{
            char[] array = {'a', 'b', 'g', 'j'};
            System.out.println(array[78]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Aritmetic Exception!!");
        }

    }
}
