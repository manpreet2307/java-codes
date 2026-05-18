import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter P, R, T: ");
        double p=sc.nextDouble(), r=sc.nextDouble(), t=sc.nextDouble();
        System.out.println("SI = " + (p*r*t/100));
    }
}