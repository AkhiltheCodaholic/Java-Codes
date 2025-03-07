class class1{
    private String name;
    void setname(String name){
        this.name = name;
    }

    String getname(){
        return name;
    }
}


public class EncapEx {
    public static void main(String[] args) {
        class1 obj = new class1();
        obj.setname("Wangshek");
        System.out.println(obj.getname());
    }    
}