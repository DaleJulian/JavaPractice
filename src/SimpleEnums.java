enum MetricSystem{
	GRAMS,
	METERS,
	LITERS
}

public class SimpleEnums {

	public static void main(String args[]){
		
		MetricSystem unit = null;
		
		unit = MetricSystem.GRAMS;
		System.out.println("Current unit of measurement is in grams.");
		
		switch(unit){
			case GRAMS:
				System.out.println("Grams measure weight.");
				break;
			case METERS:
				System.out.println("Meters measure length");
				break;
			case LITERS:
				System.out.println("Liters measure volume");
				break;
		}
	}
}
