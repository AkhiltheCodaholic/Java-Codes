public class Q2 {
    public static void main(String[] args) {
        int rows = 3; 
        int num = 1;  

        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {
                System.out.print("  "); 
            }
            
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(num + " ");
                num++; 
            }
            
            System.out.println(); 
        }
    }
}
