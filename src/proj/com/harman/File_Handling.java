package proj.com.harman;

import java.io.FileWriter;
import java.io.IOException;

public class File_Handling {

    public static void main(String[] args) {

        try
        {
            FileWriter obj = new FileWriter("Sample_File.txt");
            obj.write("Hello, This is Sherlock");
            obj.close();
            System.out.println("File has been Created Successfully !! ");    // This FileWriter has been error one
                                                                             // So, it can be resolved by a right click that and get a
               // get a suggestion like of use try and catch in that we have to click this !!
        }

        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
