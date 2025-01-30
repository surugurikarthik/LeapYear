
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int Year=sc.nextInt();
        if(Year%4==0 && Year%100!=0){
            System.out.println("Year Is Leap");
        }else{
            System.out.println("Year IS not Leap Year");
        }
        sc.close();
    }
    
}
