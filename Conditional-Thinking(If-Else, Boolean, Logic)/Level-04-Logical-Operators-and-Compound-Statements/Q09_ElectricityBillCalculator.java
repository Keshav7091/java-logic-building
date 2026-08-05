// 9. Take electricity units consumed and calculate the bill as per slabs (using if-else).


import java.util.Scanner;

class Q09_ElectricityBillCalculator{

     public static float electricityBillCalculator(float unit){
        if(unit >= 0 && unit <= 150){
            return unit * 5.50f;
        }else if(unit <= 300){
            return unit * 6f;
        }else if(unit > 300){
            return unit * 6.50f;
        }
        
        return -1f;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Unit: ");
        float unit = sc.nextFloat();
        
        System.out.println(electricityBillCalculator(unit));
    
        
        sc.close();
    }

}