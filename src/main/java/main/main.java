package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class main
{
    public static void main(String []args) throws IOException
    {

        FileReader reader=new FileReader("db.properties");
        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("password"));

    }
}
