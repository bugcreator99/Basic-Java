package loop;

import java.util.Scanner;
public class whileLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int no, f=1, i=1;
    System.out.println("Enter any Number: ");
    no = in.nextInt();
    while(i<=no)
    {
    f = f*i;
    i++;
    }
        System.out.println("The factorial of "+no+" is "+f);
    }
}
