package cis232.example;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinaryFileExample2 {

	public static void main(String[] args) throws IOException{
		//OLD WAY WITH TEXT
		Scanner inputText = new Scanner(new File("numbers.txt"));
		int number = inputText.nextInt();
		short shorty = inputText.nextShort();
		System.out.printf("Numberd from text file: %d short: %d%n", number, shorty);
		
		//NEW WAY WITH BINARY FILE
		DataInputStream inputBinary = new DataInputStream(new FileInputStream("numbers.dat"));
		number = inputBinary.readInt();
		shorty = inputBinary.readShort();
		System.out.printf("Number from binary file: %d short: %d%n", number, shorty);
		
	}

}
