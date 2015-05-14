import java.util.*;

public class LightningDistanceComputer {

	/*
	 * Computes the distance to a lightning 
	 * strike whose sound takes x seconds to 
	 * reach you
	 */
	
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		double soundDistanceOffset = 1100;
		double time;
		
		System.out.println("Seconds took for you to hear the lightning: ");
		time = scn.nextDouble();
		double distance = time * soundDistanceOffset;
		System.out.println("The lightning was " + distance + " feet away.");
		
		
	}
}
