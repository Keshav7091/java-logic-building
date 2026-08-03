// 4. Check whether a given integer is single-digit, double-digit, or multi-digit.


import java.util.Scanner;

class Q04_DigitCategory{
    public static String digitCategory(int num){
        
        if(num < 0){
            return "Number is negative";
        }
        
        if (num < 10) {
            return "Number is single-digit";
        }else if(num >= 10 && num <= 99){
            return "number is double-digit";
        }
        
        return " Number is multi-digit";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.println(digitCategory(num));
        
        sc.close();
    }
}