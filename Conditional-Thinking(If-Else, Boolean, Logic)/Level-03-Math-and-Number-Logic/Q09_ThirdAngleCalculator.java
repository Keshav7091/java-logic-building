// 9. Take two angles of a triangle and compute the third angle.


import java.util.Scanner;

class Q09_ThirdAngleCalculator{

     public static String thirdAngleCalculator(int angle1, int angle2){
        int angle3 = 0;
        if (angle1 > 0 && angle2 > 0 && angle1 + angle2 < 180){
            return String.valueOf(180 - (angle1 + angle2));
        }
        
        return "Invalid Input";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Angle: ");
        int angle1 = sc.nextInt();
        
        System.out.println("Enter the second Angle: ");
        int angle2 = sc.nextInt();
        
        System.out.println(thirdAngleCalculator(angle1, angle2));
        
        sc.close();
    }

}