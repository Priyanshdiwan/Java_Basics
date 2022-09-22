import java.io.*;
public class CharacterToUpperCase {
    public static void main(String args[]) throws Exception
    {
    ByteArrayOutputStream f = new ByteArrayOutputStream(12);
    System.out.println ();
    while (f.size() != 10)
    {
    f.write(System.in.read( ) );
    }
  
    byte b[] = f.toByteArray();
    
    System.out.println("The FIRST 12 Alphabets are:");
    for(int l=0;l<b.length;l++)
    {
    System.out.println((char)b[l]);
    }
    ByteArrayInputStream inp = new ByteArrayInputStream(b);
    int c;
    System.out.println("Converted Alphabet to upper case:");
    for (int i=0;i<1;i++)
    {
    while((c=inp.read()) != -1)
    {
    System.out.print(Character.toUpperCase((char)c));
    }
    System.out.println();
    inp.reset();
    }
    }
    }

