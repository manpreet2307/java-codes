import java.util.Scanner;
public class SwapDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        char[] arr=s.toCharArray();
        char temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println("After swap = " + new String(arr));
    }
}