import java.util.Scanner;
public class pattern_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // making square
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i <= n && j <= n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
