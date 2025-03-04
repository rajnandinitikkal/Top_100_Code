package Top_100_codes.Evenn_or_Odd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        System.out.print("Enter number: ");

        int i = sc.nextInt(); 
        if(i%2 == 0){
            System.out.println(i+ "  is Even");
        }
        else{
            System.out.println(i+ " is odd");
        }
        sc.close();
    }
}
