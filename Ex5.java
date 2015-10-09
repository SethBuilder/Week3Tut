
import java.io.EOFException;

import FormatIO.Console;
import FormatIO.FileIn;
import FormatIOX.*;

public class Ex5 {
	
	public static void main(String[] arg){
		
		Console con = new Console();
		FileIn fin = new FileIn("data.txt");
		int max = 0;
		try
			{
				for(;;){
					
					for(int i = 0; i<5; i++){
					int num = fin.readInt();
					String formatNum = String.format("%-5d", num);
					con.println(formatNum);
					if(num>max)
						max = num;
					
						
					}
				}
			}
		catch (EOFException e)
			{}
			con.println("Max number is: " + max + "finished!");
			
		con.println("Done");
	      fin.close();
	}
}
	
		



