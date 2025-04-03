public class MethodWithReturnType{
	 public static void main(String[] args){
		 MethodWithReturnType mwrt = new MethodWithReturnType();
		 int result = mwrt.addition(15,30);		 // Arguments
		 
		 System.out.printf("The sum is %d%n",result);
	 }
	public int addition(int num1, int num2){ // Parameters
		int sum = num1 + num2;
		
		return sum;
	}
}	