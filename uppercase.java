class Student{
    String name = "Mani";

    void Display(){
        System.out.println("name: " +name);
    }
    public String upperCase(){
        return name.toUpperCase();
    }
}
public class uppercase{
    public static void main(String[] args){
        Student s = new Student();
        s.Display();
        System.out.println(s.upperCase());
    }
}
