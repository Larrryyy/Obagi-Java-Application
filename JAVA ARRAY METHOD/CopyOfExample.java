import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}
