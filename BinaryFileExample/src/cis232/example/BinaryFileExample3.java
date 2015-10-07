package cis232.example;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileExample3 {

	public static void main(String[] args) {
		//Write strings to a file
		DataOutputStream dos = null;
		try {
			FileOutputStream fos = new FileOutputStream("strings.kyle");
			dos = new DataOutputStream(fos);
			dos.writeUTF("Hello file!");
			dos.writeByte(1);
			dos.writeUTF("Bye file!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if (dos != null){
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
