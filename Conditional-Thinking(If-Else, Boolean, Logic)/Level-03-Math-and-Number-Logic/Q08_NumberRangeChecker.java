// 8. Check if a number lies within the range [100, 999].


import java.util.Scanner;

class Q08_NumberRangeChecker{

    public static String numberRangeChecker(int num){
        return (num >= 100 && num <= 999) ? "Yes" : "No";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        
        System.out.println(numberRangeChecker(num));
        
        sc.close();
    }

}