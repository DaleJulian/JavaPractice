class NonIntResultException extends Exception {
	
	int n;
	int d;
	
	NonIntResultException(int i, int j){
		n = i;
		d = j;
	}
	
	public String toString(){
		return "Result of " + n + " / " + d + " is non-integer";
	}
}

public class SampleException {

	public static void main(String args[]) throws NonIntResultException{
		
		int numerator[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
		int denominator[] = { 2, 0, 4, 4, 0, 8 };
		
		for(int i = 0; i < numerator.length; i++){
			try{
				if((numerator[i] % 2) != 0)
					throw new NonIntResultException(numerator[i], denominator[i]);
				System.out.println(numerator[i] + " / " + denominator[i] + " is " 
						+  numerator[i]/denominator[i]);
			}
			catch (ArithmeticException e){
				System.out.println("Can't divide by zero!");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index is out of bounds.");
			}
			catch(NonIntResultException e){
				System.out.println(e);
			}
			
		}
	}
}

