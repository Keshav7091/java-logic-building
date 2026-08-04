//2. Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both

import java.util.Scanner;

class Q02_FizzBuzz{

    public static String fizzBuzz(int num){
        
        if(num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        }else if(num % 3 == 0){
            return "Fizz";
        }else if(num % 5 == 0){
            return "Buzz";
        }
        return "Neither Fizz nor Buzz";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        
        System.out.println(fizzBuzz(num));
        
        sc.close();
    }

}