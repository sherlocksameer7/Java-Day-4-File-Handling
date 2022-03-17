package proj.com.harman;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

public class FileInput {

    public static void main(String[] args) {

        try
        {
            FileInputStream object = new FileInputStream("C:\\Users\\sherl\\IdeaProjects\\Java Day 4 File Handling\\Output_Write.txt");

            int i=0;

            while ((i=object.read()) != -1)
            {
                System.out.println((char)i);
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
