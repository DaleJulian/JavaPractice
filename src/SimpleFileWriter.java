import java.io.*;

public class SimpleFileWriter {

	public static void main(String[] args) throws java.io.IOException{
		int i = 0; 
		
		FileInputStream source = null;
		FileOutputStream copy = null;
		
		try{
			
			source = new FileInputStream("src/Source.txt");
			copy = new FileOutputStream("src/Copy.txt");
		}
		catch (FileNotFoundException e){
			System.out.println("Files not found.");
		}
		
		do{
			i = source.read();
			if(i != -1) copy.write(i);
		}
		while(i != -1);
		
		try{
			source.close();
			copy.close();
		}
		catch (IOException e){
			System.out.print("Error closing files.");
		}
	}
}
