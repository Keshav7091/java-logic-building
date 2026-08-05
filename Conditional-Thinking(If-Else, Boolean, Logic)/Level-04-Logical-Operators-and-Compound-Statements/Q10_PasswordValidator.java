// 10. Take a password string and check basic rules (length ≥ 8 and contains at least one digit).

import java.util.Scanner;

class Q10_PasswordValidator{

    public static String passwordValidator(String pass){
        
        if(pass.length() < 8){
            return "Invalid Password";
        }
        
        for(int i = 0; i < pass.length(); i++){
            char ch = pass.charAt(i);
            
            if(Character.isDigit(ch)){
                return "Valid Password";
            }
        }
        
        return "Invalid Password";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Passsword: ");
        String pass = sc.next();
        
        System.out.println(passwordValidator(pass));
    
        
        sc.close();
    }

}