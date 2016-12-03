/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

import java.io.*;
import java.net.*;

/**
 *
 * @author User
 */
public class TCPClient {
    public static void main(String args[]) throws IOException
    {
        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser   = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket         = new Socket("localhost", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        sentence = inFromServer.readLine();
        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("From Server: " + modifiedSentence);
        clientSocket.close();

    }
}
