import java.lang.reflect.Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 56, 89, 12, 90, 7};
        int max = numbers[0]; 
        int n = Array.getLength(numbers);

        for (int i=0;i<n;i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest element in the array: " + max);
    }
}
