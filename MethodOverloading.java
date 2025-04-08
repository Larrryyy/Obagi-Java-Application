import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Perimeter of different shapes");
        System.out.println("Enter 1 To Calculate Perimeter Of A Square");
        System.out.println("Enter 2 To Calculate Perimeter Of A Rectangle");
        System.out.println("Enter 3 To Calculate Perimeter Of A Circle");
        System.out.println();

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Enter the length of the Square: ");
                int lengthOfSquare = input.nextInt();

                MethodOverloading.shape(lengthOfSquare);
            }
            break;

            case 2: {
                System.out.print("Enter the length of the Rectangle: ");
                int lengthOfRectangle = input.nextInt();

                System.out.print("Enter the breadth of the Rectangle: ");
                int breadthOfRectangle = input.nextInt();

                MethodOverloading.shape(lengthOfRectangle, breadthOfRectangle);
            }
            break;

            case 3: {
                System.out.print("Enter the Radius of the Circle: ");
                double radiusOfCircle = input.nextDouble();

                MethodOverloading.shape(radiusOfCircle);
            }
            break;

            default: {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    public static void shape(int length) {
        int perimeterOfSquare = 4 * length;

        System.out.printf("The perimeter of the square is %d%n", perimeterOfSquare);
    }

    public static void shape(int length, int breadth) {
        int perimeterOfRectangle = 2 * (length + breadth);

        System.out.printf("The perimeter of the rectangle is %d%n", perimeterOfRectangle);
    }

    public static void shape(double radius) {
        double perimeterOfCircle = 2 * Math.PI * radius;

        System.out.printf("The perimeter of the circle is %.2f%n", perimeterOfCircle);
    }
}
