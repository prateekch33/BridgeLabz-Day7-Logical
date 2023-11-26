import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1=0,n2=1,n3=0;
        System.out.println("Enter the value of n: ");
        int n=in.nextInt();
        System.out.println("Fibonacci Series upto "+n+" terms:");
        System.out.print(n1+" "+n2+" ");
        for(int i=0;i<n-2;i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
        in.close();
    }
}
