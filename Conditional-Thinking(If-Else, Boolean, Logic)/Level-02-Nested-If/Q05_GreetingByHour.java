// Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.

import java.util.Scanner;

class Q05_GreetingByHour{
    public static String greetingByHour(int hour){
        
        if(hour < 0 || hour > 23){
            return "Invalid hour";
        } 
        
        if(hour < 12){
            return "Good Morning";
        }else if(hour < 15){
            return "Good Afternoon";
        }else if(hour < 19){
            return "Good Evening";
        }
        
        return "Good Night";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour: ");
        int hour = sc.nextInt();
        
        System.out.println(greetingByHour(hour));
        
        sc.close();
    }
}