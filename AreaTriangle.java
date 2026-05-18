import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base and height: ");
        double b=sc.nextDouble(), h=sc.nextDouble();
        System.out.println("Area = " + (0.5*b*h));
    }
}