import java.util.Scanner;
public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter number: ");
            int n=sc.nextInt();
            System.out.println("Square = " + (n*n));
        }finally{System.out.println("Program ended");}
    }
}