package singleinheritance;

public class Library extends student{

    private int bookDue = 5;


    public Library(int regno, String stdname, String group, int bookDue){
        super(regno, stdname, group);
        this.bookDue = bookDue;
    }

    void showDetails(){
        System.out.println(regno +" " + stdname +" " + group +" " + bookDue);
    }

    public static void main(String[] args) {
        Library lib = new Library(101, "Akhil", "Science", 3);
        lib.showDetails();
        lib.display();
    }
}