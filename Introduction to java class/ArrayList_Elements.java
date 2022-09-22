import java.util.ArrayList;
public class ArrayList_Elements {
    public static void main(String[] args) {
    ArrayList<String> array1 = new ArrayList<>();
    array1.add("Pen");
    array1.add("Pencil");
    array1.add("Eraser");

    System.out.println("ArrayList: " + array1);
    String rmd = array1.remove(2);
    System.out.println("Updated ArrayList: " + array1);
    System.out.println("Removed Element: " + rmd);
    

}
}