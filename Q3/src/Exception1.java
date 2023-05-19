import java.io.IOException;

public class Exception1 {

	
	public boolean check(int i) throws IOException {
		boolean f=true;
		if (i<0) {
			 throw new IOException("number smaller than o");
			
		}
		return f;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		Exception1 exception1=new Exception1();
		exception1.check(-4);

	}

}
