 import java.util.Scanner;
 
 public class SentinelLoop {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		double average ;
		long product = 1;
		int counter = 0;
		
		System.out.print("Enter -1 to mark end of input");
		while (true){
			System.out.print("Enter number: ");
			int num = input.nextInt();
			
			if(num == -1){
				break;
			}
			counter++;
			sum += num;
			product *= num;
		}
		average = (double)sum/counter;
		
		System.out.printf("The sum is %d%n",sum);
		System.out.printf("The average is %.2%n",average);
		System.out.printf("The product is %d%n",product);
	}
 }	