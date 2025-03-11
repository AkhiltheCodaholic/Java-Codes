package singleinheritance;

public class Placement extends Examination{
    public boolean interviewAttended;
    public boolean selected;



    public Placement(int regno,String stdname,String group,boolean interviewAttended,boolean selected) {
        super(regno, stdname, group, 90, 50, 50);
        this.interviewAttended = interviewAttended;
        this.selected = selected;
    }

    public void displayPlacementDetails() {
        calculateResult();
        System.out.println("Regno: "+regno+" Name: "+stdname+" Group: "+group+" Interview Attended: "+interviewAttended+" Selected: "+selected +
        " Total Marks: "+totalMarks+" Average: "+average+" Result: "+result);
    }

    public static void main(String[] args) {
        System.out.println("Placement Part: ");
        Placement plc = new Placement(30, "abhi", "A", true, true);
        plc.displayPlacementDetails();
    }

}