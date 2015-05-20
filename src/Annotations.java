

// Deprecate a class
@Deprecated 
class MyClass{
	
	private String msg;
	
	MyClass(String m){
		msg = m;
	}
	
	//deprecate a method within a class
	@Deprecated 
	String getMsg(){
		return msg;
	}
}


class Annotations{
	
	public static void main(String args[]){
		
		MyClass myObj = new MyClass("Test");
		
		System.out.println(myObj.getMsg());
	}
}