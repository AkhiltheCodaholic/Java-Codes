import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine(); 

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine()); 

            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
} 
