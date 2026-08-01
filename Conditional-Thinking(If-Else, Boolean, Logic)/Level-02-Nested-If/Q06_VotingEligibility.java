// Check voting eligibility for a given age (18+)

import java.util.Scanner;

class Q06_VotingEligibility{

    public static String votingEligibility(int age){
        return (age >= 18) ? "You are eligible" : "Not eleigible";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println(votingEligibility(age));
        
        sc.close();
    }
    
}