import java.util.Scanner;
public class MultiCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter two numbers: ");
            int a=sc.nextInt(), b=sc.nextInt();
            System.out.println(a/b);
        }catch(ArithmeticException e){System.out.println("Divide by zero");}
        catch(Exception e){System.out.println("Error occurred");}
    }
}