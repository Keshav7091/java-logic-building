public class Q05LeapYear{
    public static String leapYear(int year){
        // boolean isLeapYear = false;
            
        // if(year % 400 == 0){
        //     isLeapYear = true; 
        // }else if(year % 100 == 0){
        //     isLeapYear = false;
        // }else if(year % 4 == 0){
        //     isLeapYear = true;
        // }
        
        // return (isLeapYear) ? "Leap Year" : "Not a Leap Year";
    
        
    // ------------------------------------------------------------------
        // optimize version
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        
        return isLeapYear ? "Leap Year" : "Not a Leap Year";
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();

        System.out.println(leapYear(year));

        sc.close();
    }
}