import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> factors=new ArrayList<>();
        System.out.print("Enter the number you want to check in perfect or not: ");
        int n=in.nextInt();
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                factors.add(i);
            }
        }
        int sum=0;
        for(int i:factors) {
            sum+=i;
        }
        if(sum==n) {
            System.out.println(n+" is a perfect number.");
        }else {
            System.out.println(n+" is not a perfect number.");
        }
    }
}
