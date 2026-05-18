import java.util.Scanner;
public class WordsVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s=sc.nextLine();
        int count=0;
        for(String w:s.split(" "))
            if("AEIOUaeiou".indexOf(w.charAt(0))!=-1) count++;
        System.out.println("Words starting with vowel = " + count);
    }
}