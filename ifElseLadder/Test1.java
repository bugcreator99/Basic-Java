package ifElseLadder;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int p;
        System.out.println("Enter your Marks: ");
        p = in.nextInt();
        
        if(p>=60)
            System.out.println("First Div");
        else if(p>=45)
            System.out.println("Second Div");
        else if(p>=33)
            System.out.println("Third Div");
        else
            System.out.println("Sorry!! you are fail!!!");
    }
}
