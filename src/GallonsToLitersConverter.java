import java.util.*;

/* Improved version */
public class GallonsToLitersConverter {

	public static void main(String args[]){
		
		double gallons;
		double liters;
		
		int counter = 0;
		
		for(gallons = 1; gallons <= 100; gallons++){
			liters = gallons * 3.7854f; //convert to liters
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			counter++;
			//for every tenth line, print a blank line
			if(counter == 10){
				System.out.println();
				counter = 0; //reset counter;
			}
		}
		
		/*
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter gallons: ");
		gallons = scnr.nextInt();
		
		liters = gallons * 3.7854f; //convert to liters
		System.out.println(gallons + " Gallons converted to " + liters + " liters");
		*/
	}
}
