package method;

public class Sample4 {
    public int Sub()
    {
    int a,b=10,c=7;
    a = b-c;
    return a;
    }
    
    public static void main(String[] args) {
        Sample4 obj = new Sample4();
        int rs = obj.Sub();
        System.out.println(rs);
    }
}
