import java.util.*;

public class GallonsToLitersConverter {

	public static void main(String args[]){
		
		double gallons;
		double liters;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter gallons: ");
		gallons = scnr.nextInt();
		
		liters = gallons * 3.7854f; //convert to liters
		System.out.println(gallons + " Gallons converted to " + liters + " liters");
	}
}
