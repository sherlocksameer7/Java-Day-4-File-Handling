package proj.com.harman;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Read_file {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the name of a Person: ");
        String data = inp.nextLine();

        try
        {
            FileOutputStream object = new FileOutputStream("Read_File.txt");
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
