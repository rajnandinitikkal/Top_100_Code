package Top_100_codes.Check_no_positive_or_negative;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();
        if(i>0){
            System.out.println("Number is positive");

        }else{
            System.out.println("Number is Negative");
        }
        sc.close();
    }
}
