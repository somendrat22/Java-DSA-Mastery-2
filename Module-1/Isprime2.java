import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean isPrime = true;
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }


    }
}
