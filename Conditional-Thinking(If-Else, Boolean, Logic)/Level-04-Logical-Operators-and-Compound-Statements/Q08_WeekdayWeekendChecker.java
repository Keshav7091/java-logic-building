// 8. Take a weekday number (1–7) and determine if it is a weekday or weekend.


import java.util.Scanner;

class Q08_WeekdayWeekendChecker{

    public static String weekdayWeekendChecker(int num){
        if(num >= 1 && num <= 7){
            if(num == 1 || num == 2 || num == 3 || num == 4 || num == 5){
                return "Weekdays";
            }else if(num == 6 || num == 7){
                return "Weekend";
            }
        }
        
        return "Input Out of Range";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The dayNumber: ");
        
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(weekdayWeekendChecker(num));
        } else {
            System.out.println("Invalid Input");
        }
    
        
        sc.close();
    }

}