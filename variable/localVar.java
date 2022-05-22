package variable;
/*
Local variable
*/
public class localVar {
    public void add(){
    int x,y=20,z=30;
    x = y+z;
        System.out.println("Add: "+x);
    }
    public static void main(String[] args) {
        localVar obj = new localVar();
        obj.add();
    }
}