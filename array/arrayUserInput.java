package array;
import java.util.Scanner;
public class arrayUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ar[]=new int[5];
        int i;
        for(i=0;i<=4;i++)
        {
            System.out.println("Enter element at "+(i+1));
            ar[i]=in.nextInt();
        }
        for(i=0;i<=4;i++)
            System.out.println("Value at ar["+i+"]= "+ar[i]);
    }
}
