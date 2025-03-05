public class CustomPattern {
    public static void main(String[] args) {
        int rows = 3; 

        for (int i = 1; i <= rows; i++) {
            System.out.println("     " + i); 

            
            System.out.print("     ");
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}
