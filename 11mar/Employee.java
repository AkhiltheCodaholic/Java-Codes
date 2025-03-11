class EmpDet{
    private int empID;
    private String name;
    private double salary;
    private int mobile;

    public int getEmpId(){
        return empID;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getMobile(){
        return mobile;
    }

    public void setMobile(int mobile){
        this.mobile = mobile;
    }

}
public class Employee {

    public static void main(String[] args) {
        EmpDet emp = new EmpDet();
        emp.setEmpID(23);
        emp.getEmpId();
        emp.setMobile(1234567);
        emp.getMobile();
        emp.setSalary(454565);
        emp.getSalary();
        emp.setname("akihl");
        emp.getname();

        System.out.println(emp.getMobile());
    }
}