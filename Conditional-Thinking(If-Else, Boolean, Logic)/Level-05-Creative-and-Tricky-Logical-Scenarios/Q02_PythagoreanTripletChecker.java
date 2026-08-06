// 2. Take three numbers and check if they can form a Pythagorean triplet.


import java.util.Scanner;

class Q02_PythagoreanTripletChecker{

    public static String pythagoreanTripletChecker(int num1, int num2, int num3){
        if (num1 > 0 && num2 > 0 && num3 > 0){
            int squareNum1 = num1 * num1;
            int squareNum2 = num2 * num2;
            int squareNum3 = num3 * num3;
            
            if (squareNum1 + squareNum2 == squareNum3 || squareNum2 + squareNum3 == squareNum1 || squareNum1 + squareNum3 == squareNum2){
                return "It's a Pythagorean Triplet";
            }else{
                return "It is not a Pythagorean Triplet";
            }
        }
        
        return "Invalid input";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        
        System.out.println("Enter Number 3");
        int num3 = sc.nextInt();
        
        System.out.println(pythagoreanTripletChecker(num1, num2, num3));
        
        sc.close();
    }

}