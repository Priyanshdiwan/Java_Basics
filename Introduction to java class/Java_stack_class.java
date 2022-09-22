import java.util.Stack;
public class Java_stack_class {
    public static void main (String args[]) {
        Stack stack1 = new Stack();
        stack1.push("Pen");
        stack1.push("Pencil");
        stack1.push("Eraser");
        System.out.println("Initial Stack " + stack1);
        System.out.println("Removed Element: " + stack1.pop());
        System.out.println("Position of Pencil: " + stack1.search("Pencil"));
}
}
