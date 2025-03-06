public class ConEx{
    String name;
    int num;
    public ConEx(){
        name = "Akhil";
        num = 20;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Number: "+num);
    }
    public static void main(String[] args) {
        ConEx obj = new ConEx();
        obj.show();
    }
}