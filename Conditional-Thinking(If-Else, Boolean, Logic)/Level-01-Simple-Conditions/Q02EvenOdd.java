import java.util.Scanner;

public class Q02EvenOdd{
    public static String evenOdd(int number){

        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(evenOdd(number));

        sc.close();
    }
}