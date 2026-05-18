import java.util.Scanner;
public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s=sc.nextLine().toLowerCase();
        boolean[] seen=new boolean[26];
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z') seen[c-'a']=true;
        }
        boolean pangram=true;
        for(boolean b:seen) if(!b) pangram=false;
        System.out.println(pangram?"Pangram":"Not Pangram");
    }
}