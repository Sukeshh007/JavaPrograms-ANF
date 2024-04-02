package com.demoIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIODemo {

	public static void main(String[] args) throws IOException{

		FileOutputStream fos = new FileOutputStream("primitive.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeInt(20);
		dos.writeDouble(2.5);
		dos.close();
		fos.close();
		
		System.out.println("File Created");
		System.out.println("=================");
		System.out.println("file readed");
		
		FileInputStream fis = new FileInputStream("primitive.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());

		
		
	}

}
