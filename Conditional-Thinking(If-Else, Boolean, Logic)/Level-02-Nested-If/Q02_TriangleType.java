// If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene

import java.util.Scanner;

class Q02_TriangleType{


     public static boolean validTriangle(int side1, int side2, int side3){
      
        if(side1 <= 0 || side2 <= 0 || side3 <= 0){
                return false;
        }
            
        return side1 + side2 > side3 &&
            side2 + side3 > side1 &&
            side1 + side3 > side2;
    }
    
    public static String getTriangleType(int side1, int side2, int side3){
        
        if(validTriangle(side1, side2, side3)){
            if(side1 == side2 && side2 == side3){
                return "This is Equilateral Triangle";
            }else if(side1 == side2 || side2 == side3 || side1 == side3){
                return "This is Isosceles Triangle";
            }else{
                return "This is Scalene Triangle";
            }
        }
        
        return "This is not a valid triangle";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        int side1 = sc.nextInt();
        
        System.out.println("Enter the second side");
        int side2 = sc.nextInt();
        
        System.out.println("Enter the third side");
        int side3 = sc.nextInt();
        
        System.out.println(getTriangleType(side1, side2, side3));
        
        sc.close();

}