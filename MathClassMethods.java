import java.util.Scanner;

public class MathClassMethods{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter interger: ");
		 int num = input.nextInt();
		 
		 System.out.printf("The absolute value is %d%n",Math.abs(num));
		 
		 System.out.printf("Enter a float point: ");
		 double num1 = input.nextDouble();
		 
		 System.out.printf("The rounded value is %d%n",Math.round(num1));
		 
		 System.out.printf("The rounded value is %f%n",Math.pow(num1,2));
		 
		 System.out.printf("The rounded value is %f%n",Math.sqrt(num1));
		 
		 System.out.println("==============================================");
		 
		 System.out.printf("Enter the first number");
		 int number1 = input.nextInt();
		 
		 System.out.printf("Enter the second number");
		 int number2 = input.nextInt();
		 
		 System.out.printf("The minimum number is %d%n",Math.min(number1,number2));
		 
		 System.out.printf("The random number is %f%n",Math.random());
		 
		 System.out.println("==============================================");
		 
		 System.out.printf("To calculate area of a circle");
		 
		 System.out.printf("Enter the radius of the circle: ");
		 int radius = input.nextInt();
		 
		 double areaOfCircle = Math.PI * Math.pow(radius,2);
		 
		 System.out.printf("The area of the circle is %f%n",areaOfCircle);
	 }
}	 
	