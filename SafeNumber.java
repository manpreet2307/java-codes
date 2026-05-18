import java.util.Scanner;
public class SafeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        String s=sc.nextLine();
        try{
            int n=Integer.parseInt(s);
            System.out.println("Valid number = " + n);
        }catch(NumberFormatException e){System.out.println("Not a valid integer");}
    }
}