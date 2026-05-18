import java.util.Scanner;
public class KmtoMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km=sc.nextDouble();
        System.out.println("Miles = " + (km*0.621371));
    }
}