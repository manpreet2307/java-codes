import java.util.Scanner;
public class calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("enter operator(+ , - , * , /): ");
        char operator = sc.next().charAt(0);
        double result;
        
        switch(operator){
            case'+':
                result = a + b;
                break;
            case'-':
                result = a - b;
                break;
            case'*':
                result = a * b;
                break;
            case'/':
                if(b != 0){
                    result = a / b;
                }else{
                    System.out.println("error , can't divide by 0");
                }
            default:
                System.out.println("invalid operator");
                return;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}