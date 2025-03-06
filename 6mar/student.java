public class student {

    String name;
    int roll;
    int marks;

    public student(String name, int roll, int marks){
        this.name =  name;
        this.roll = roll;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: "+name+"  Roll: "+roll+"  Marks: "+marks);
    }

    public static void main(String[] args) {
        student obj = new student("Akhil", 20, 100);
        obj.display();
    }
}