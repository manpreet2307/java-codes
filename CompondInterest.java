import java.util.Scanner;

public class CompondInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double t = sc.nextDouble();

        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("Compound Interest = " + ci);
    }
}