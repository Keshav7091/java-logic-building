// Take marks (0–100) and print the corresponding grade (A/B/C/D/F).

import java.util.Scanner;

class Q03_GradeCalculator{

    public static char gradeCalculator(int marks){
        if(marks >= 80){
            return 'A';
        }else if(marks >= 60){
            return 'B';
        }else if(marks >= 50){
            return 'C';
        }else if(marks >= 30){
            return 'D';
        }
        
        return 'F';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        
        System.out.println(gradeCalculator(marks));
        
        sc.close();
    }

}