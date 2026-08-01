// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’

import java.util.Scanner;

class Q08_AlphabetRangeChecker{

    public static String alphabetRangeChecker(char ch){
        ch = Character.toLowerCase(ch);
        
        if(Character.isLetter(ch)) {
            if ('a' <= ch && ch <= 'm'){
                return "Character lies between 'a' and 'm'";
            }else {
                return "Character lies between 'n' and 'z'";
            }
        }
        return "Invalid Input";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        
        
        System.out.println(alphabetRangeChecker(ch));
        
        sc.close();
    }
    
}