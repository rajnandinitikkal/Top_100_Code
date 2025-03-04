package Top_100_codes.Prime_Number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    // int number;
    // int flag = 0;
    // System.out.print("Enter the number: ");
    // Scanner sc = new Scanner(System.in);
    // number = sc.nextInt();

    // if(number == 0 || number ==1){
    //     System.out.println(number+ " is not a prime number");
    // }
    // else{
    //     int middleNumber = number /2;
    //     for(int i =2; i<=middleNumber; i++){
    //         if(number % i == 0){
    //             System.out.println(number+ " is not a prime number");
    //             flag = 1;
    //             break;
    //         }
    //     }
    //     if(flag == 0){
    //         System.out.println(number+ " is a prime number");
    //     }
    // }


    // sc.close();


    System.out.print("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if(isPrime(num)){
            System.out.println(num+ "is a prime number");
        }
        else{
            System.out.println(num+ " is not a prime number");
        }
        sc.close();
    }
    

        public static boolean isPrime(int num) {
            if(num <= 1)  return false ;
            if(num == 2 || num ==3) return true;

            for(int i = 2; i<= Math.sqrt(num); i++){
               if(num % i == 0) {return false;}
            }

            return true;
        }
}
