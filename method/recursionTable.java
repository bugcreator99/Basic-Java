package method;

public class recursionTable {
    void table(int no)
    {
    if(no<=50)
        {
            System.out.print(no+" ");
            no = no+5;
            table(no);
        }
    }
    
    public static void main(String[] args) {
        recursionTable obj = new recursionTable();
        obj.table(5);
    }
}
