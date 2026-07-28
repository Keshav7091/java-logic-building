import java.util.Scanner;

public class Q06GreaterOfTwo{
    public static String greaterOfTwo(int num1, int num2){
        
        if(num1 == num2){
            return "Both Numbers are equal";
        }
        
        
        return (num1 > num2) ? num1 + " is Greater" : num2 + " is greater";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();

        System.out.println(greaterOfTwo(num1, num2));

        sc.close();
    }
}