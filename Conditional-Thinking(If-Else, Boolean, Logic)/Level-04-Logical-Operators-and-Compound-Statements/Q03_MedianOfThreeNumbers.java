//3. Take three numbers and print the median value (neither maximum nor minimum).


import java.util.Scanner;

class Q03_MedianOfThreeNumbers{

    public static int medianOfThreeNumbers(int num1, int num2, int num3){
        if((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)){
            return num2;
        }else if((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)){
            return num1;
        }
        
        return num3;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the Third Number: ");
        int num3 = sc.nextInt();
        
        System.out.println(medianOfThreeNumbers(num1, num2, num3));
        
        sc.close();
    }

}