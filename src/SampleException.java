
public class SampleException {

	public static void main(String args[]){
		
		int numerator[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denominator[] = { 2, 0, 4, 4, 0, 8};
		
		for(int i = 0; i < numerator.length; i++){
			try{
				System.out.println(numerator[i] + " / " + denominator[i] + " = " + numerator[i]/denominator[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("No matching element found.");
			}
			catch(Throwable e){
				System.out.println("Some error occured.");
			}
		}
	}
}


