import java.io.Console;

public class Consolepass{
    public static void main(String[] args) {
        Console cc = System.console();
        String name = cc.readLine("Enter name please: ");
        char[] pass = cc.readPassword("Enter password: ");

        String password = new String(pass);

        System.out.println(name);
        System.out.println(password);
    }
}