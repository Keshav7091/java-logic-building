import java.util.Scanner;

public class Q03DivBy5{
    public static boolean divBy5(int number){

        return (number % 5 == 0) ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        System.out.println(divBy5(number));

        sc.close();
    }
}