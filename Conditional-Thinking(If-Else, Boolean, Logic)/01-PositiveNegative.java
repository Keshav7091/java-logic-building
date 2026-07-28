public class 01-PositiveNegative{

    public static String PositiveNegative(int num){
        if(num < 0){
            return "Negative";
        }else if(num > 0){
            return "Positive";
        }else{
            return "Zero";
        }
    }

    public static void main(String[] args){
        int num = 10;
        PositiveNegative(num);
    }
}