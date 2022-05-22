package userInput;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name;
        int rollNo;
        float marks;
        
        System.out.println("Enter your Name: ");
        name = obj.nextLine();
        
        System.out.println("Enter your Roll No: ");
        rollNo = obj.nextInt();
        
        System.out.println("Enter your Marks: ");
        marks = obj.nextFloat();
        
        System.out.println("Welcome MR./MRS. "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks is: "+marks);
    }
}
