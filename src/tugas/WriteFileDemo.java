/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author User
 */
public class WriteFileDemo {
    public static void main(String args[])
    {
        FileOutputStream fos = null;
        File file;
        String mycontent = "his is my Data which needs" +
                            "to be written into file";
        try{
            file = new File("D://myfile.txt");
            fos = new FileOutputStream(file);

            if(!file.exists())
            {
                file.createNewFile();
            }

            byte[] bytesArray = mycontent.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File berhasil di input");
            
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        finally{
            try{
                if(fos != null)
                {
                    fos.close();
                }
            }
            catch(IOException ioe){
                System.out.println("Error in clossing the Steam");
            }
        }
    }
}
