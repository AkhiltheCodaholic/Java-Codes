class AccountDet{
    private int acno;
    private String name;
    private double balance;

    public int getAcno(){
        return acno;
    }
    public void setAcno(int acno){
        this.acno = acno;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBal(){
        return balance;
    }
    public void setBal(int balance){
        this.balance = balance;
    }
}

public class Account {

    public static void main(String[] args) {
        AccountDet acc = new AccountDet();
        acc.setAcno(1234);
        acc.getAcno();
        acc.setName("Akhil");
        acc.getName();
        acc.setBal(10000);
        acc.getBal();
        
        System.out.println(acc.getName() + acc.getBal());
    }
}