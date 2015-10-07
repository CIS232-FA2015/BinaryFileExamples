package cis232.example;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryFileExample4 {
	public static void main(String[] args){
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("strings.kyle"));
			String firstWords = dis.readUTF();
			byte randomByte = dis.readByte();
			String lastWords = dis.readUTF();
			
			System.out.printf("%s %d %s%n", firstWords, randomByte, lastWords);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e){
			System.out.println("End of file reached!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			if(dis != null){
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
