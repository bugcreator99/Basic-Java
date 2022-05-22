package nastedIf;

public class Test {
    public static void main(String[] args) {
        int no = 6;
        if(no>2)    //true condition
        {
            if(no<3)    //false condition
                System.out.println("Hello World");
        }
        System.out.println("JAVA programming");
    }
}
