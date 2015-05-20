
/*
 * A simple generic class
 * 
 * Here, T is the parameter type that
 * will be replaced by a real type 
 * when an object of type Gen is created.
 */

class Gen<T, U>{
	
	T tobject; //declare an object of type T
	U uobject;
	//Pass the constructor a reference to 
	//an object of type T
	Gen(T obj, U obj2){
		tobject = obj;
		uobject = obj2;
	}
	
	//Return object
	T getObjectT(){
		return tobject;
	}
	
	U getObjectU(){
		return uobject;
	}
	
	//Show type of T
	void ShowType(){
		System.out.println("Type of T is " + tobject.getClass().getName());
		System.out.println("Type of U is " + uobject.getClass().getName());
	}
}

public class SampleGenerics {
	
	public static void main(String args[]){
		//Create a Gen ref for Integers
		
		//Create a Gen<Integer> object and assign its
		//reference to iObj. Notice the use of autoboxing
		//to encapsulate the value 88 within an Integer object
		Gen<Integer, String> iObj = new Gen<Integer, String>(88, "Dale");
	
		//show the type used by iObj
		iObj.ShowType();
		
		//Get the value in iObj. Notice that there is no cast needed
		int v = iObj.getObjectT();
		String st = iObj.getObjectU();
		System.out.println("Values of iObj: " + v + " " + st);
		System.out.println();
		
		
		
	}
}
