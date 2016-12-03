/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReverseNumberWhile {
    public static void main(String args[])
    {
        int num = 0;
        int reversenum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number and press enter:");

        num = scan.nextInt();
        while(num != 0)
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

            System.out.println("Reverse of input number is: "+reversenum);

    }
}
