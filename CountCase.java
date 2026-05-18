import java.util.Scanner;
public class CountCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        int up=0, low=0;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)) up++;
            else if(Character.isLowerCase(c)) low++;
        }
        System.out.println("Uppercase="+up+", Lowercase="+low);
    }
}