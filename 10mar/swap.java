public class swap {

    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bb";
        String temp;
        System.out.println("Second string before swap: "+s2);

        temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("Second string after swap: "+s2);
    }
}