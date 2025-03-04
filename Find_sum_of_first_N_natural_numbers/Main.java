package Top_100_codes.Find_sum_of_first_N_natural_numbers;

import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {     
//         int n =10;
//         int sum =0;
//         for( int i=1; i<=n; i++){
//             sum += i;
//             System.out.println(sum);
//         }
//     }
// }

public class Main
 { public static void main (String[]args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
     int n = sc.nextInt();
     int sum = 0;

     for (int i = 1; i <= n; i++)
         sum += i;
       System.out.print("The sum of " +n+ " number is "+sum);

       sc.close();
   }

 }
