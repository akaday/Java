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
public class TCPServer {
    public static void main(String args[]) throws IOException
    {
        String clientSentence;
        int capitalizedSentence = 0;
        ServerSocket welcomeSocket = new ServerSocket(6789);

        while(true)
        {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient     = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient    = new DataOutputStream(connectionSocket.getOutputStream());

            clientSentence = inFromClient.readLine();
            System.out.println("Receive : " + clientSentence);
//            capitalizedSentence = clientSentence.toUpperCase()+ '\n';
            outToClient.writeByte(capitalizedSentence);
        }
    }
            
}

