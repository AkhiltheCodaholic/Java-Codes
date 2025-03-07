abstract class Database{
    abstract void connecting();
    void disconnecting(){
        System.out.println("Disconnecting from database");
    }
}

class bank extends Database{
    void connecting(){
        System.out.println("Connected to database");
    }
}

public class Abstract2Ex {

    public static void main(String[] args) {
        bank obj = new bank();
        obj.connecting();
        obj.disconnecting();
    }
}