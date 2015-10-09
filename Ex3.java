import java.io.EOFException;

import FormatIO.Console;
import FormatIO.FileIn;
import FormatIOX.*;

public class Ex3 {
	
	public static void main(String[] arg){
		
		Console con = new Console();
		FileIn fin = new FileIn("data.txt");
		try
			{
				for(;;){
					int num = fin.readInt();
					con.println(num);
				}
			}
		catch (EOFException e)
			{}
			con.println("finished!");
			
		con.println("Done");
	      fin.close();
	}
}
	
		



