package singleinheritance;

public class student {
    public int regno;
    public String stdname;
    public String group;

    public void display(){
        System.out.println(regno + stdname + group);
    }

    public student(int regno , String stdname , String group){
        this.regno = regno;
        this.stdname = stdname;
        this.group = group;

    }
}