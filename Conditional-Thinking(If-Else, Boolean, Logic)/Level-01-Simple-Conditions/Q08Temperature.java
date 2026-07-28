import java.util.Scanner;

public class Q08Temperature{
    public static String temperature(int temp){
        
        if(temp < 16){
            return "Cold";
        }else if(temp < 40){
            return "Warm";
        }
        
        return "Hot";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the temp: ");
        int temp = sc.nextInt();
        

        System.out.println(temperature(temp));

        sc.close();
    }
}