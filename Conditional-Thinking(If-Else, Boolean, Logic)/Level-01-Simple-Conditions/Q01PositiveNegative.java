import java.util.Scanner;

class Q01PositiveNegative{

    public static String positiveNegative(int number){
        if(number < 0){
            return "Negative";
        }else if(number > 0){
            return "Positive";
        }

        return "Zero";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(positiveNegative(number));

        sc.close();
    }
}