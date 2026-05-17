import java.util.Scanner;
public class swapping_two_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("before swapping a = " + a + " and b = " + b);
        a = a + b;
        b = a - b;
        b = a - b;
        System.out.print("after swapping a = " + a + " and b = " + b);
        sc.close();
    }
}
