import java.util.Scanner;
public class print_even_number {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("even number from 1 to " + num + " are : ");
        for(int i = 2; i<=num;i++){
            if(i %2 == 0){
                System.out.print( i + " ");
            }
        }
        sc.close();
    }
}