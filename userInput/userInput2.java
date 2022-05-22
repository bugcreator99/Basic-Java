package userInput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class userInput2 {
    public static void main(String[] args) {
        /*
        * Creating the instance of class BufferedReader
        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try{
            System.out.println("Enter your name: ");
            name = reader.readLine();
            System.out.println("Welcome "+name);
        } catch(Exception e){
        }
    }
}
