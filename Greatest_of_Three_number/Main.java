package Top_100_codes.Greatest_of_Three_number;

public class Main {
    public static void main(String[] args) {
       int num1 = 20;
       int num2 = 58;
       int num3 = 49;

       if(num1 >= num2 && num1 >= num3){
        System.out.println("The greatest number is: " + num1);
       }
       else if(num2 >= num1 && num2 >= num3){
        System.out.println("The greatest number is: " + num2);
       }
       else if(num3 >= num1 && num3 >= num2){
        System.out.println("The greatest number is: " + num3);
       }
    }
}
