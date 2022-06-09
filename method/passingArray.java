package method;

public class passingArray {
    public void array(int ar[])
    {
    int sum=0;
    for(int i=0; i<ar.length; i++)
        {
        sum = sum+ar[i];
        }
        System.out.println("Total sum: "+sum);
    }
    
    public static void main(String[] args) {
        int b[]= {10,50,40,80,70};
        passingArray obj = new passingArray();
        obj.array(b);
    }
}
