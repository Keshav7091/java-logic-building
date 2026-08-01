// Take three sides and check if they form a valid triangle.


import java.util.Scanner;


class Q01_ValidTriangle{
    public static String validTriangle(int side1, int side2, int side3){
      
        if(side1 + side2 > side3 &&
            side2 + side3 > side1 &&
            side1 + side3 > side2){
                return "Valid Triangle";
            }
            
            return "Not a valid Trianlge";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        int side1 = sc.nextInt();
        
        System.out.println("Enter the second side");
        int side2 = sc.nextInt();
        
        System.out.println("Enter the third side");
        int side3 = sc.nextInt();
        
        System.out.println(validTriangle(side1, side2, side3));
        
        sc.close();
    }
}