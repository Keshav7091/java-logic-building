// Take a 3-digit number and check if all digits are distinct.

import java.util.Scanner;

class Q01_DistinctDigits{
    public static String distinctDigits(int num){
        if (num < 100 || num > 999) {
            return "Number Not three digit";
        }
        int lastDigit = num % 10;
        int middleDigit = (num / 10) % 10;
        int firstDigit = (num / 100);
    
        return (firstDigit != middleDigit && firstDigit != lastDigit && middleDigit != lastDigit) ? "All digits are distinct" : "All digits are not distinct";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.println(distinctDigits(num));
        
        sc.close();
    }
}