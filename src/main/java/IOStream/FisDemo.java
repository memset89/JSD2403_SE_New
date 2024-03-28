
package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.io.Reader;
public class FisDemo{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream("fos.dat");
        int d;
        d = fis.read();
        System.out.println(d);
        d=fis.read();
        System.out.println(d);
        while(d!=-1)
        {
            d=fis.read();
            System.out.println(d);
        }
        fis.close();
    }
}