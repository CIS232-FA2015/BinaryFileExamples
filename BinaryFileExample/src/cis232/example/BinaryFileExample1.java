package cis232.example;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class BinaryFileExample1 {

	public static void main(String[] args) {
		//OLD TEXT FILE WAY
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("numbers.txt");
			pw.write("123456");
			pw.write(" ");
			pw.write(" 10000");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(pw != null){
				pw.close();
			}
		}
		
		//NEW BINARY WAY
		DataOutputStream output = null; 
		try{
			output = new DataOutputStream(new FileOutputStream("numbers.dat"));
			output.writeInt(123456);
			output.writeShort(10000);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(output != null){
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
