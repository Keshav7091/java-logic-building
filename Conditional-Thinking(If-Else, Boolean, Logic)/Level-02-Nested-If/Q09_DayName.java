// Take a day number (1–7) and print the corresponding day name

import java.util.Scanner;

class Q09_DayName{

    public static String dayName(int dayNum){
        
        if(dayNum == 1){
            return "Monday";
        }else if(dayNum == 2) {
            return "Tuesday";
        }else if(dayNum == 3) {
            return "Wednesday";
        }else if(dayNum == 4) {
            return "Thursday";
        }else if(dayNum == 5) {
            return "Friday";
        }else if(dayNum == 6) {
            return "Saturday";
        }else if(dayNum == 7) {
            return "Sunday";
        }
        
        return "Invalid input";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of day: ");
        int dayNum = sc.nextInt();
        
        
        System.out.println(dayName(dayNum));
        
        sc.close();
    }

}