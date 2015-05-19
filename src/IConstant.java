
/*
 * This interface is declared public 
 * so that it can be implemented by 
 * code in any package.
 */

/*
 * By convention, interface names
 * should start with an I
 */
public interface IConstant{ 
	
	int MIN = 10;
	int MAX = 432;
	String ERROR_MSG = "Index out of bounds.";
	
}

class MyClass implements IConstant{
	
	public int getNext(){
		return 1;
	}
	
	public void reset(){
		//TODO: reset
	}
	
	public void setStart(int x){
		x = 0;
		//TODO: reset
	}
}


