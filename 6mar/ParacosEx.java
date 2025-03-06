public class ParacosEx {

    String name;
    int num;

    public ParacosEx(String name, int num){
        this.name = name;
        this.num = num;
    }
    void display(){
        System.out.println("Name: "+name+"  Number: "+num);
    }

    public static void main(String[] args) {
        ParacosEx obj = new ParacosEx("Akhil", 20);
        obj.display();
    }
}