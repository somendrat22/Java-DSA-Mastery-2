import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long fact = 1;

        for(int i = 2; i <= n; i = i + 1){
            fact = fact*i;
        }

        System.out.println(fact);

    }
}
