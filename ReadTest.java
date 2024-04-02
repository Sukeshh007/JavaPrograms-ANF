package com.demoIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadTest {
	public static void mian() throws IOException {

		File f1 = new File("input.txt");
		FileReader fr = new FileReader(f1);
		try (BufferedReader br = new BufferedReader(fr)) {
			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			System.out.println("file read Sucessfully");
		}
	}

}
