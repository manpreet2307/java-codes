import java.util.Scanner;
public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side: ");
        double s=sc.nextDouble();
        System.out.println("Perimeter = " + (4*s));
    }
}