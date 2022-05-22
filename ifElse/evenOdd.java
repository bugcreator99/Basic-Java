package ifElse;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int no;
        
        System.out.println("Enter your Integer: ");
        no = in.nextInt();
        
        if(no%2==0)
            System.out.println(no+" is Even");
        else
            System.out.println(no+" is Odd");
    }
}
