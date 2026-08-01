// Check if one of two given numbers is a multiple of the other.

import java.util.Scanner;

class Q04_MultipleOfAnother{
    
    public static String checkMultiple(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            return "NO";
        }
        
        if(num1 % num2 == 0 || num2 % num1 == 0){
            return "Yes";
        }
        
        return "No";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second Number: ");
        int num2 = sc.nextInt();
        
        System.out.println(checkMultiple(num1, num2));
        
        sc.close();
    }

}