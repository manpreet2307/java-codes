import java.util.Scanner;
public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine(); String res="";
        for(char c:s.toCharArray()) if(res.indexOf(c)==-1) res+=c;
        System.out.println("Without duplicates = " + res);
    }
}