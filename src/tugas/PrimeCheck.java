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
public class PrimeCheck {
    public static void main(String args[])
    {
        int temp;
        boolean isPrime=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for check:");

        int num = scan.nextInt();
        for(int i=2; i<=num/2; i++)
        {
            temp=num%i;
            if(temp == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is prime Number");
        else
            System.out.println(num + " is not prime Number");

    }
}
