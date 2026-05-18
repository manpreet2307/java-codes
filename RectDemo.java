import java.util.Scanner;
class Rect {
    double l,w;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and width: ");
        l=sc.nextDouble(); w=sc.nextDouble();
    }
    double area(){return l*w;}
}
public class RectDemo {
    public static void main(String[] args) {
        Rect r=new Rect();
        r.input();
        System.out.println("Area = " + r.area());
    }
}