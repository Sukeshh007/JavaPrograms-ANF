package com.demoIO;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos= new FileOutputStream("pDetails.txt");
		
		ObjectOutputStream os= new ObjectOutputStream(fos);
		
		Person ps=new Person(07, "Sukesh");
		
		os.writeObject(ps);
		
		os.close();
		fos.close();
		
		System.out.println("File created");
		System.out.println("------");
		System.out.println("Reading object from file ie. De-Serialization");
		
		FileInputStream fis=new FileInputStream("pDetails.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Person  ps1=(Person) ois.readObject();
		
		System.out.println(ps1.getPid());
		
		System.out.println(ps1.getP_name());
		
		ois.close();
		fis.close();
		
		
//		person object  ----------pid int , pname string
//		object to primitivr type coversion
		

	}

}
