import java.util.Scanner;
import java.io.*;

class Ques1
{
    public static void main(String[] input)
    {
        String f_name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter File Name to Open(with extension) : ");
        fname = scan.nextLine();
        String line = null;
        try
        {
            FileReader a = new FileReader(fname);
            BufferedReader b = new BufferedReader(a);   
            while((line = b.readLine()) != null)
            {
                System.out.println(line);
            }
            b.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}