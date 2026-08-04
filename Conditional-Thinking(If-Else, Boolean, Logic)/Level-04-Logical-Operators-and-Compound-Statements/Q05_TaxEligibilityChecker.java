// 5. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

import java.util.Scanner;

class Q05_TaxEligibilityChecker{

    public static String taxEligibilityChecker(int income, int age){
        
        if(income < 0 || age < 0){
            return "You are not eleigible";
        }
        
        return (income >= 500000 && age >= 18) ? "You are eleigible" : "You are not eleigible";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        
        System.out.println(taxEligibilityChecker(income, age));
        
        sc.close();
    }

}