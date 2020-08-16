package com.Iooperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceinputEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos1 = new FileOutputStream("file1.doc");
		FileOutputStream fos2 = new FileOutputStream("file2.doc");
		FileOutputStream fos3 = new FileOutputStream("file3.doc");
		String str1 = "welcome";
		byte b[] = str1.getBytes();
		fos1.write(b);
		String str2 = "to java";
		byte b1[] = str1.getBytes();
		fos1.write(b1);
		String str3 = "learning code";
		byte b2[] = str3.getBytes();
		fos1.write(b2);
		FileInputStream fis1 = new FileInputStream("file1.doc");
		FileInputStream fis2 = new FileInputStream("file2.doc");
		FileInputStream fis3 = new FileInputStream("file3.doc");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int i;
		while ((i = sis.read()) != -1) {
		    System.out.print((char) i);    
		}
	}

}
