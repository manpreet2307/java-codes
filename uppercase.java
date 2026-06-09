class Student{
    String name = "Mani";

    void Display(){
        System.out.println("name: " +name);
    }
    public char charAt(int index){
        return name.charAt(index);
    }
}
public class uppercase{
    public static void main(String[] args){
        Student s = new Student();
        s.Display();
        System.out.println(s.charAt(1));
    }
}
