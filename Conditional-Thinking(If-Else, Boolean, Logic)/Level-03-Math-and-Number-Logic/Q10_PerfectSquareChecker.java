// 10. Check whether a number is a perfect square (without using the square root function).


import java.util.Scanner;

class Q10_PerfectSquareChecker{

    public static String perfectSquareChecker(int num){
        
        if(num < 0){
            return "Number is Not Perfect Square";
        }
        
        if(num == 0 || num == 1){
            return "Number is Perfect Square";
        }
        
        for (int i=1; i * i <= num; i++){
            if(i * i == num){
                return "Number is perfect Square";
            }
        }
        
        return "Number is Not Perfect Square";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        
        System.out.println(perfectSquareChecker(num));
        
        sc.close();
    }

}