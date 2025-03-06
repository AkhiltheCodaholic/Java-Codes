public class copybook {

    String title;
    String author;
    int price;

    public copybook(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    copybook(copybook obj){
        this.title = obj.title;
        this.author = obj.author;
        this.price = obj.price;
    }

    public void display(){
        System.out.println("Title: "+title+"  Author: "+author+"  Price: "+price);
    }

    public static void main(String[] args) {
        copybook obj = new copybook("Java", "Akhil", 100);
        obj.display();
    }
}