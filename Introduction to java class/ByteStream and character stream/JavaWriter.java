import java.io.*;  
public class JavaWriter {
    private static final String All = null;

    public static void main(String[] args) {  
        try { 

            Writer w = new FileWriter("output_forWriter.txt");  

            String content = " Welcome All " ;

            w.write(content);  

            w.close();  

            System.out.println("Done");  

        } catch (IOException e) {  

            e.printStackTrace();  

        }  
    }
}