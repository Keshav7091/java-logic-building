// 8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.

import java.util.Scanner;

class Q08_DigitSumVsProduct{

    public static String digitSumVsProduct(int num){
        if (num >= 1 && num <= 9999){
            int sum = 0;
            int product = 1;
            
            while(num > 0){
            
                int digit = num % 10;
            
                sum += digit;
            
                product *= digit;
            
                num /= 10;
            }
            
            if (sum > product){
                return "Digit sum is greater than product";
            }
            else{
                return "Digit sum is not greater than product";
            }
            
        }
        
        return "Invalid Input";
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1");
        int num = sc.nextInt();
        
        System.out.println(digitSumVsProduct(num));
        
        sc.close();
    }

}