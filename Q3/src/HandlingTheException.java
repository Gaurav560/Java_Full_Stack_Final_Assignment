import java.io.IOException;
import java.util.Scanner;

public class HandlingTheException {

	
	public void check(int i) throws IOException {
		
		if (i<0) {
			 throw new IOException("number smaller than o");
			
		}else {
			System.out.println("Its good. does not throws exception.");
		}
	}
	
	
	
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the integer value::");
			int i=scanner.nextInt();
			HandlingTheException exception1=new HandlingTheException();
			exception1.check(i);
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
