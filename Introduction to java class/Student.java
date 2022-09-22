public class Student {
    String name;
    String id;
    int marks;

    Student(String pName, String pId, int pMarks){
        name = pName;
        id = pId;
        marks = pMarks;
    }

    public void getName(){
        System.out.println("Name: " + name);
    }

    public void getId(){
        System.out.println("ID: " + id);
    }

    public void getMarks(){
        System.out.println("Marks: " + marks);
    }
}



