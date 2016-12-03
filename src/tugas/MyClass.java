/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

/**
 *
 * @author User
 */
class WelcomeMessage {
    public static void printMessage()
    {
        System.out.println("Hello World");
    }
}

public class MyClass {
    public static void main(String []args)
    {
        WelcomeMessage obj = new WelcomeMessage();
        obj.printMessage();
    }
}
