package com.Iooperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTestEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout=new FileOutputStream("testout.txt ");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2016);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");    
		   pout.close();    
		   fout.close();    
		  System.out.println("Success?");    
		 }    
	}


