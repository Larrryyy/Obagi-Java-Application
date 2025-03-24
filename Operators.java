public class Operators{
	public static void main(String[] args){
		//Assignment operator(=)
		
		int num1 = 13;
		int num2 = 5;
		
		//Arithmetic operator(+,*,-,/,%) perform basic mathematical operations
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int difference = num1 - num2;
		
		double quotient = (double)num1 / num2;
		
		int remainder = num1 % num2;
		
		//Relational Operator(>,<,>=,<=,==,!=)This is used for comparizm 
		boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterThanorEqualTo = num1 >= num2;
		boolean isLessThanorEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean isNotEqualTo = num1 != num2;
		
		//Logical Operator(&&,||,!)
		boolean isAndOperator = num1 > num2 && num1 >= num2;
		boolean isOrOperator = num1 == num2 || num1 > num2;
		boolean isNotOperator = !(num1 == num2 || num1 > num2);
		
		
		
		System.out.printf("The sum of the numbers is %d%n",sum);
		System.out.printf("The product of the numbers is %d%n",product);
		System.out.printf("The difference between %d and %d is %d%n",num1,num2,difference);
		System.out.printf("The quotient is %f%n",quotient);
		System.out.printf("The remainder is %d%n",remainder);
		System.out.println("=================================================");
		System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isGreaterThanorEqualTo);
		System.out.printf("Is %d <= %d? %b%n",num1,num2,isLessThanorEqualTo);
		System.out.printf("Is %d == %d? %b%n",num1,num2,isEqualTo);
		System.out.printf("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
		System.out.println("=================================================");
		System.out.printf("Is %d > %d && %d >= %d? %b%n",num1,num2,num1,num2, isAndOperator);
		System.out.printf("Is %d == %d || %d > %d? %b%n",num1,num2,num1,num2, isOrOperator);
		System.out.printf("Is !(%d == %d || %d > %d)? %b%n",num1,num2,num1,num2, isNotOperator);
	}
}	