import java.util.Scanner;

public class Q09VowelConsonant {
    public static String vowelConsonant(char ch){
        ch = Character.toUpperCase(ch);
        
        // if (Character.isLetter(ch)) {
        //     if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        //         return "Vowel";
        //     }
            
        //     return "Consonant";
        // }
        
        // return "Invalid character";
        
        //--------------------------------------------------------
        // optimized version
        
        if (!Character.isLetter(ch)) {
           return "Invalid Character"; 
        }
        
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        

        System.out.println(vowelConsonant(ch));

        sc.close();
    }

}