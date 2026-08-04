// 6. Take coordinates (x, y) and determine which quadrant the point lies in.


import java.util.Scanner;

class Q06_QuadrantChecker{

    public static String quadrantChecker(int x, int y){
        if(x == 0 && y == 0){
            return "Origin";
        }else if(x == 0){
            return "(x, y) are lies in y axis";
        }else if(y == 0){
            return "(x, y) are lies in x axis";
        }else if(x > 0 && y > 0){
            return "(x, y) are lies in 1st quadrant";
        }else if(x < 0 && y > 0){
            return "(x, y) are lies in 2nd quadrant";
        }else if(x < 0 && y < 0){
            return "(x, y) are lies in 3rd quadrant";
        }else if(x > 0 && y < 0){
            return "(x, y) are lies in 4th quadrant";
        }
        
        return "";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the x: ");
        int x = sc.nextInt();
        
        System.out.println("Enter the y: ");
        int y = sc.nextInt();
        
        System.out.println(quadrantChecker(x, y));
        
        sc.close();
    }

}