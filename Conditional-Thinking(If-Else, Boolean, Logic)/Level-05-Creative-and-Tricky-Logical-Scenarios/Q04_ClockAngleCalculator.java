// 4. Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

import java.util.Scanner;

class Q04_ClockAngleCalculator{

    public static float clockAngleCalculator(int hour, int minute){
        if(hour == 12){
            hour = 0;
        }
        
        if (hour >= 0f && hour < 12f && minute >= 0f && minute < 60f){
            
            float hourDegree = 30 * hour;
            float minuteDegree = 6 * minute;
            
            float result = (hourDegree + (0.5f * minute)) - minuteDegree;
            result = Math.abs(result);
            
            if (result > 180){
                result = 360 - result;
            }
            
            return result;
        }
        
        return -1;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Hour");
        int hour = sc.nextInt();
        
        System.out.println("Enter Minute");
        int minute = sc.nextInt();
        
        System.out.println(clockAngleCalculator(hour, minute));
        
        sc.close();
    }

}