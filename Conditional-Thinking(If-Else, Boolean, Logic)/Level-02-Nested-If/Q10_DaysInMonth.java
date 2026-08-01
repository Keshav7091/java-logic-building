// Take a month number (1–12) and print the number of days in that month (ignore leap years).

import java.util.Scanner;

class Q10_DaysInMonth{

    public static String daysInMonth(int numMonth){
        
        if(numMonth == 1 || numMonth == 3 || numMonth == 5 || numMonth == 7 || numMonth == 8 || numMonth == 10 || numMonth == 12){
            return "31";
        }else if(numMonth == 2) {
            return "28";
        }else if(numMonth == 4 || numMonth == 6 || numMonth == 9 || numMonth == 11) {
            return "30";
        }
        
        return "Invalid input";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the month number: ");
        int numMonth = sc.nextInt();
        
        
        System.out.println(daysInMonth(numMonth));
        
        sc.close();
    }

}