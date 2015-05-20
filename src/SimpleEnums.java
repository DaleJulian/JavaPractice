
enum MetricSystem{
	GRAMS('g'),
	METERS('m'),
	LITERS('l');
	
	private char symbol;
	
	MetricSystem(char s){
		symbol = s;
	}
	
	public char getSymbol(){
		return symbol;
	}
}

public class SimpleEnums {

	public static void main(String args[]){
		
		for(MetricSystem ms : MetricSystem.values()){
			System.out.println((ms.name() + " " + ms.getSymbol()));
		}
	}
}



