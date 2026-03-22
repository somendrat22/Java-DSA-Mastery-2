import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
		int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        // When i will come 
        int pos = count - 1;
        int rnum = 0;

        while(n != 0){
            int rem = n%10;
            int q = n/10;
            rnum = rnum + rem*(int)Math.pow(10, pos);
            pos--;
            n = q;
        }

        System.out.println(rnum);
    }
}
