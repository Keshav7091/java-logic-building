// Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither

import java.util.Scanner;

class Q02_MiddleDigitChecker{

    public static String middleDigitChecker(int num){
        if (num < 100 || num > 999) {
            return "Number Not three digit";
        }
        int last = num % 10;
        int middle = (num / 10) % 10;
        int first = (num / 100);
    
        if(first == middle && middle == last){
            return "All digits are equals";
        }
        if(middle < first && middle < last){
            return "Middle is smallest";
        }else if(middle > first && middle > last){
            return "Middle is largest";
        }
        
        return "neither";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.println(middleDigitChecker(num));
        
        sc.close();
    }

}