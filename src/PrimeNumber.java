import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number you want to check is prime or not: ");
        int n=in.nextInt();
        boolean flag=true;
        if(n==0||n==1) {
            flag = false;
        } else {
            for(int i=2;i<n;i++) {
                if(n%i==0) {
                    flag=false;
                    break;
                }
            }
        }
        System.out.println(flag?n+" is a prime number.":n+" is not a prime number.");
        in.close();
    }
}
