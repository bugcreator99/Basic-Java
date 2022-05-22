package variable;
/*
    Instance Variable
 */
public class instanceVar {
    int x,y=10,z=20;
    public void add(){
        x = y+z;
        System.out.println("Add: "+x);
    }
    public void sub(){
        x = z-y;
        System.out.println("Sub: "+x);
    }
    public static void main(String[] args) {
        instanceVar obj = new instanceVar();
        obj.add();
        obj.sub();
    }
}
