
package method;

public class recursion1 {
    void demo()
    {
        System.out.println("JAVA");
        demo();     //self calling
    }
    public static void main(String[] args) {
        recursion1 obj = new recursion1();
        obj.demo();
    }
}
