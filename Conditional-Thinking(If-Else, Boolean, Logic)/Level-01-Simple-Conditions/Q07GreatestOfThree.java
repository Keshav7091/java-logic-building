import java.util.Scanner;

public class Q07GreatestOfThree{
    public static String greatestOfThree(int num1, int num2, int num3){
        
        if(num1 >= num2 && num1 >= num3){
            return num1 + " is largest";
        }else if(num2 >= num1 && num2 >= num3){
            return num2 + " is largest";
        }
        
        return num3 + " is largest";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the number3: ");
        int num3 = sc.nextInt();

        System.out.println(greatestOfThree(num1, num2, num3));

        sc.close();
    }
}