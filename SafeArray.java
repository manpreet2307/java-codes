import java.util.Scanner;
public class SafeArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index (0 to 2): ");
        int i = sc.nextInt();
        if(i >= 0 && i < arr.length) {
            System.out.println("Value = " + arr[i]);
        } else {
            System.out.println("Invalid index");
        }
    }
}
