  public class RecursionEx {

    static long fact(int n){
        if (n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        
        System.out.println(fact(59));
        //fact(5);
    }
}