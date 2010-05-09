package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readLine {
	public static void main(String args[]) throws IOException {
		FileReader reader = new FileReader("Data/wordMaping.dat");
		BufferedReader br = new BufferedReader(reader);
		String s1 = null;
		while ((s1 = br.readLine()) != null) {
			System.out.println(s1);
		}
		br.close();
		reader.close();
	}

}
