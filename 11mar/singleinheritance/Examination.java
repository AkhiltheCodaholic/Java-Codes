package singleinheritance;

public class Examination extends student{
    protected int subject1;
    protected int subject2;
    protected int subject3;
    protected double totalMarks;
    protected double average;
    protected String result;

    public Examination(int regno,String stdname,String group,int subject1,int subject2,int subject3) {
        super(regno, stdname, group);
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    void calculateResult() {
        totalMarks = subject1+subject2+subject3;
        average = totalMarks/3.0;
        if(average>=60) {
            result = "Pass";
        }
        else {
            result = "Fail";
        }

    }

    void displayResult(){
        System.out.println("Regno: "+regno+" Name: "+stdname+" Group: "+group);
        System.out.println("Total Marks: "+totalMarks+" Average: "+average+" Result: "+result);
    }

    public static void main(String[] args) {
        System.out.println("Examination Part: ");
        Examination exm  = new Examination(20, "abhi", "A", 50, 50, 80);
        exm.calculateResult();
        exm.displayResult();
    }

}