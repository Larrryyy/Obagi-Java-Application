import java.util.Arrays;

public class CompareExample {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"apple", "orange"};
        int result = Arrays.compare(array1, array2);
        System.out.println("Comparison result: " + result); // Negative if array1 < array2
    }
}
