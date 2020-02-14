package com.core.java;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
	 
	public class Copyfile
	{
	    public static void main(String[] args)
	    {
	    	try{
	    	    File infile =new File("C:\\Users\\meet.patel.SPECINDIA\\Desktop\\text1.txt");
	    	    File outfile =new File("C:\\Users\\meet.patel.SPECIINDIA\\Desktop\\text2.txt");
	 
	    	    FileInputStream instream = new FileInputStream(infile);
	    	    FileOutputStream outstream = new FileOutputStream(outfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    
	    	    while ((length = instream.read(buffer)) > 0){
	    	    	outstream.write(buffer);
	    	    }
	    	    instream.close();
	    	     outstream.close();

	    	    System.out.println("File copied successfully!!");
	 
	    	}catch(Exception e){
	    		//ioe.printStackTrace();
	    	 }
	    }
	}
