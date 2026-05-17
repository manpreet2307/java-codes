import java.util.Scanner;
public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        System.out.println(s.replaceAll("[aeiouAEIOU]",""));
    }
}