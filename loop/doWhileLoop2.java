
package loop;
import java.util.Scanner;
public class doWhileLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no, f=1, i=1;
        System.out.println("Enter any number: ");
        no = in.nextInt();
        do{
        f = f*i;
        i++;
        }
        while(i<=no);
        System.out.println("The factorial of "+no+" is "+f);
    }
}
