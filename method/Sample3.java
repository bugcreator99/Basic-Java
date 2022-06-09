package method;

public class Sample3 {
    public void add(int y,int z)
    {
    int x= y+z;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        Sample3 obj = new Sample3();
        obj.add(10, 6);
    }
}
