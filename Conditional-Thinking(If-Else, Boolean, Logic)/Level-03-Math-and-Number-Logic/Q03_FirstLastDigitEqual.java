// 3. Take a 4-digit number and check if the first and last digits are equal.


import java.util.Scanner;

class Q03_FirstLastDigitEqual{
    public static String firstLastDigitEqual(int num){
        if (num < 1000 || num > 9999) {
            return "Number Not four digit";
        }
        int last = num % 10;
        int first = (num / 1000);
    
       return (first == last) ? "First and Last Digits are equal" : "First and Last Digits are not equal";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.println(firstLastDigitEqual(num));
        
        sc.close();
    }
}