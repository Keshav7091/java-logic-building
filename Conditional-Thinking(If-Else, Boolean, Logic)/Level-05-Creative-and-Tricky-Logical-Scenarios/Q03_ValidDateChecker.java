// 3. Take day and month and check if it forms a valid calendar date (ignoring leap years).


import java.util.Scanner;

class Q03_ValidDateChecker{

     public static String validDateChecker(int day, int month){
        if(day > 0 && month > 0 && month <= 12){
            if(day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)){
                return "Valid date";
            }else if(day <= 28 && month == 2){
                return "Valid date";
            }else if(day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)){
                return "Valid date";
            }else{
                return "Invalid date";
            }
        }
        
        return "Invalid Input";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Day");
        int day = sc.nextInt();
        
        System.out.println("Enter The Month");
        int month = sc.nextInt();
        
        System.out.println(validDateChecker(day, month));
        
        sc.close();
    }

}