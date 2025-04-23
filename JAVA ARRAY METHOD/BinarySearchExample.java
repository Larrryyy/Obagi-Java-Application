import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 9};
        int key = 5;
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("Index of " + key + ": " + index);
    }
}
