

import java.util.Scanner;
public class Main{

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    if(year % 400 == 0){
        System.out.println(year+ " is a Leap year");
    }
    else if(year%4 == 0 && year%100 != 0)
    {
        System.out.println(year+ " is a Leap year");
    }
    else{
        System.out.println(year+ " is a Not Leap year");
    }
    sc.close();
}
}