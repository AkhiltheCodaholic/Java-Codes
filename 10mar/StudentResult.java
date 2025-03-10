import java.util.Scanner;

class StudentResult{
    public static void main(String[] args) {
        int rno,sub1,sub2,sub3;
        String stdname;
        int tot, average;
    
        //Scanner sc = new Scanner(System.in);
        sub1 = 5;
        sub2 = 4;
        sub3 = 4;
    
        tot = sub1+sub2+sub3;
        average = tot/3;
        System.out.println(average);
        double perc = (tot/15)*100;
        System.out.println(perc);
    
        if(perc > 60){
            System.out.println("first");
        }else if(perc > 50 && perc < 60){
            System.out.println("Second");
        }else{
            System.out.println("Third");
        }
    }
}