import java.util.Scanner;

public class Q04DivBy3And5{
    public static boolean divBy3And5(int number){

        return (number % 5 == 0 && number % 3 == 0) ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        System.out.println(divBy5(number));

        sc.close();
    }
}