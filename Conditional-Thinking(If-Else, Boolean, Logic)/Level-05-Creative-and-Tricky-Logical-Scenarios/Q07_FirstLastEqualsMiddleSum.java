// 7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.


import java.util.Scanner;

class Q07_FirstLastEqualsMiddleSum{
    public static String firstLastEqualsMiddleSum(int num){
        if (num >= 100 && num <= 999){
            int lastDigit = num % 10;
            int middleDigit = (num / 10) % 10;
            int firstDigit = (num / 100) % 10;
            
            if(firstDigit + lastDigit == middleDigit){
                return "First and last equal to middle";
            }else{
                return "First and last not equal to middle";
            }
        }
        
        return "Invalid Input";
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1");
        int num = sc.nextInt();
        
        System.out.println(firstLastEqualsMiddleSum(num));
        
        sc.close();
    }

}