//6. Take two numbers and check if both are positive and their sum is less than 100.


import java.util.Scanner;

class Q06_PositiveSumChecker{

    public static String positiveSumChecker(int num1, int num2){
        int sum = num1 + num2;
        
        if(num1 > 0 && num2 > 0 && sum < 100){
            return "Both Numbers are Valid";
        }
        
        return "Both Numbers are Not Valid";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The first Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter The Second Number: ");
        int num2 = sc.nextInt();
        
        System.out.println(positiveSumChecker(num1, num2));
        
        sc.close();
    }

}