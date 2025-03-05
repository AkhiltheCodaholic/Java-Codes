public class Q3 {
    public static void main(String[] args) {
        int rows = 3; // Number of repeated sections

        for (int i = 1; i <= rows; i++) {
            System.out.println("     " + i); // Print the number with spaces for alignment

            // Print "1 2 3 4" with spaces
            System.out.print("     ");
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line
        }
    }
}
