import FormatIO.*;
public class Ex6 {
	
	public static void main(String[] arg){
		
		Console con = new Console();
		int sum = 0;
		for(;;)
		{
			con.println("Enter number");
			int num = con.readInt();
			 sum += num;
			 con.println("Sum is " + sum + "\ncontinue?");
			 String reply = con.readWord();
			 if(reply.equals("quit")){
				 con.println("Thanks!");
				 break;
			 }
			
		}
		
		}
	}


