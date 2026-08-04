// 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.


import java.util.Scanner;

class Q04_AMPMChecker{

    public static String AMPMChecker(int hour, int minute){
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60){
            if(hour < 12){
                return "It's AM";
            }else {
                return "It's PM";
            }
        }
        
        return "Invalid input";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Hour: ");
        int hour = sc.nextInt();
        
        System.out.println("Enter the Minute: ");
        int minute = sc.nextInt();
        
        
        System.out.println(AMPMChecker(hour, minute));
        
        sc.close();
    }

}