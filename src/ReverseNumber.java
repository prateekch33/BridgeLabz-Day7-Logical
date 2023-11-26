import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int n=in.nextInt();
        int reverseNumber=0;
        while(n!=0) {
            int rem=n%10;
            reverseNumber=reverseNumber*10+rem;
            n/=10;
        }
        System.out.println("Reversed Number is: "+reverseNumber);
        in.close();
    }
}
