import java.io.*;

public class SimpleFileReader {

	public static void main(String args[]) throws java.io.IOException{
		
		int i = 0;
		
		FileInputStream file = null;
		try{
			file = new FileInputStream("src/sample.txt");
		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		
		do {
			i = file.read();
			if(i != -1) System.out.print((char)i);
		}
		while(i != 1);
		
		try{
			file.close();
		}
		catch(IOException exc){
			System.out.println("Error closing file.");
		}
	}
}


