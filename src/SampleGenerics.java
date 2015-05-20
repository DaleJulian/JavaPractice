
/*
 * A simple generic class
 * 
 * Here, T is the parameter type that
 * will be replaced by a real type 
 * when an object of type Gen is created.
 */

class Gen<T>{
	
	T object; //declare an object of type T
	
	//Pass the constructor a reference to 
	//an object of type T
	Gen(T obj){
		object = obj;
	}
	
	//Return object
	T getObject(){
		return object;
	}
	
	//Show type of T
	void ShowType(){
		System.out.println("Type of T is " + object.getClass().getName());
	}
}

public class SampleGenerics {
	
	public static void main(String args[]){
		//Create a Gen ref for Integers
		
		//Create a Gen<Integer> object and assign its
		//reference to iObj. Notice the use of autoboxing
		//to encapsulate the value 88 within an Integer object
		Gen<Integer> iObj = new Gen<Integer>(88);
	
		//show the type used by iObj
		iObj.ShowType();
		
		//Get the value in iObj. Notice that there is no cast needed
		int v = iObj.getObject();
		System.out.println("Value: " + v);
		System.out.println();
		
		//Create a Gen object for Strings
		Gen<String> strObj = new Gen<String>("Hello, world");
		
		//Show the type of data used by strObj
		strObj.ShowType();
		
		
	}
}
