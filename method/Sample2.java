package method;

public class Sample2 {
   public void add()
   {
    int x,y=5,z=7;
    x = y+z;
       System.out.println("Add: "+x);
   }
   
    public static void main(String[] args) {
        Sample2 obj = new Sample2();
        obj.add();
    }
}