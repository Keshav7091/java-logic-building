import java.util.Scanner;

public class Q10CharacterType {
    public static String characterType(char ch) {
        if (Character.isUpperCase(ch)) {
            return "UpperCase";    
        } else if (Character.isLowerCase(ch)) {
            return "LowerCase";
        } else if (Character.isDigit(ch)) {
            return "Digit";
        }
        
        return "Special Character";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);
        
        System.out.println(characterType(ch));
        
        sc.close();
        
    }
}