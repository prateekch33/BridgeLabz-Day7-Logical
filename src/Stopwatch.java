import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        Instant start=Instant.now(),end;
        do {
            System.out.print("Choose to either start or end the stopwatch: \n");
            System.out.println("1. Start the Stopwatch.");
            System.out.println("2. Stop the Stopwatch");
            n=in.nextInt();
            switch (n){
                case 1: {
                    start=Instant.now();
                    System.out.println("Stopwatch Started");
                    break;
                }
                case 2: {
                    end=Instant.now();
                    Duration timeElapsed= Duration.between(start,end);
                    System.out.println("Total time elapsed: "+timeElapsed.toMillis()+" milliseconds");
                    break;
                }
                default: {
                    System.out.println("Invalid Option.");
                    break;
                }
            }
        }while(n!=2);
        in.close();
    }
}
