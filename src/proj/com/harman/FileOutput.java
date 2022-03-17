package proj.com.harman;

import java.io.FileOutputStream;

import java.io.IOException;


public class FileOutput {

    public static void main(String[] args) {

        try
        {
            FileOutputStream object = new FileOutputStream("Output_Write.txt");

            String data = "Welcome to Java";   // Storing in a data variable using the String of giving a sentence as a given input !!

            byte b[] = data.getBytes();
            object.write(b);
            object.close();
            System.out.println("File has been Created Successfully !! ");
        }

        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
