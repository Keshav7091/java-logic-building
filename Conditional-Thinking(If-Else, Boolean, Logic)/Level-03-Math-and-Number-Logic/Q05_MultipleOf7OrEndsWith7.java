// 5. Check if a number is a multiple of 7 or ends with 7.


import java.util.Scanner;

class Q05_MultipleOf7OrEndsWith7{
    public static boolean multipleOf7OrEndsWith7(int num){
        
        int lastDigit = num % 10;
        
        return (num % 7 == 0 || lastDigit == 7);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.println(multipleOf7OrEndsWith7(num));
        
        sc.close();
    }
}