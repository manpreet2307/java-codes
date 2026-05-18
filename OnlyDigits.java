import java.util.Scanner;
public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        boolean allDigits=true;
        for(char c:s.toCharArray()) if(!Character.isDigit(c)) allDigits=false;
        System.out.println(allDigits?"Only digits":"Contains other characters");
    }
}