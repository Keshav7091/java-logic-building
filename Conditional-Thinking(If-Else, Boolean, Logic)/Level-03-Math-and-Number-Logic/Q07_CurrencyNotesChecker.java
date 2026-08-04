// 7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.


import java.util.Scanner;

class Q07_CurrencyNotesChecker{

    public static String currencyNotesChecker(int amount){
        int remAmount = 0;
        remAmount = amount % 2000;
        remAmount = remAmount % 500;
        remAmount = remAmount % 100;
    
        
        if(remAmount == 0){
            return "Yes";
        }
        
        return "No";
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an Amount: ");
        int amount = sc.nextInt();
        
        System.out.println(currencyNotesChecker(amount));
        
        sc.close();
    }

}