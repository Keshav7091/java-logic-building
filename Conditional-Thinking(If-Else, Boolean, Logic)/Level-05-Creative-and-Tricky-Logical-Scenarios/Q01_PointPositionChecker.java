// 1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.

import java.util.Scanner;

class Q01_PointPositionChecker{

    public static String pointPositionChecker(int xCord, int yCord){
        if(xCord == 0 && yCord == 0){
            return "Cordinates are lies on origin";
        }else if(xCord == 0){
            return "Cordinates are lies on Y axis";
        }else if(yCord == 0){
            return "Cordinates are lies on X axis";
        }
        
        return "Cordinates are lies on other destination";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter X coordinate");
        int xCord = sc.nextInt();
        
        System.out.println("Enter Y coordinate");
        int yCord = sc.nextInt();
        
        System.out.println(pointPositionChecker(xCord, yCord));
        
        sc.close();
    }

}