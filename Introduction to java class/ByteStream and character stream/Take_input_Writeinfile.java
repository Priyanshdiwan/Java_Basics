import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Take_input_Writeinfile {
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Type your text:");
        String text= scan.nextLine();

        FileWriter fw=new FileWriter("output.txt");

        for (int i = 0; i < text.length(); i++)
            fw.write(text.charAt(i));

        System.out.println("Writing successful");
        fw.close(); 
    }
}
