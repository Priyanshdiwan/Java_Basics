import java.util.*;
public class add_element{
    public static void main(String args[])
    {
        Vector<String> vector1 = new Vector<String>();
        vector1.add("pen");
        vector1.add("pencil");
        vector1.add("Eraser");
        System.out.println(vector1);
        System.out.println("Element at index 2:"+ vector1.get(2));


        vector1.add(0,"BOX");
        System.out.println("Updated vector"+vector1);
        System.out.println("Element at index 2:"+ vector1.get(2));


    
    }
}

