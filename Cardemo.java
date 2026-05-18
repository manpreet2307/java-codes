import java.util.Scanner;
class Car {
    String model; int year;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter model: ");
        model=sc.nextLine();
        System.out.print("Enter year: ");
        year=sc.nextInt();
    }
    void display(){System.out.println(model+" "+year);}
}
public class Cardemo {
    public static void main(String[] args) {
        Car c=new Car();
        c.input(); c.display();
    }
}