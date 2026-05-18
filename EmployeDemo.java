import java.util.Scanner;
class Employee {
    String name; double salary;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter salary: ");
        salary=sc.nextDouble();
    }
    void display(){System.out.println(name+" earns "+salary);}
}
public class EmployeDemo {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.input(); e.display();
    }
}