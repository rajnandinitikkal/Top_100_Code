package Top_100_codes.PrimeNumber;

public class prime {
    public static void main(String[] args) {
        int n = 100;
        for(int i=2; i*i>=n; i++ ){

            if(n%i == 0){
                System.out.println(n + " is not a prime number");
                break;
            }
        }
    }
    
}
