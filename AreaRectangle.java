import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and width: ");
        double l=sc.nextDouble(), w=sc.nextDouble();
        System.out.println("Area = " + (l*w));
    }
}