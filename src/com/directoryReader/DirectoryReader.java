package com.directoryReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DirectoryReader {
	
	private File a = new File("C:\\Users\\Rahul\\workspace\\text.txt");
	private BufferedReader br;
	
	public static void main(String[] args)
	{
	  DirectoryReader dr = new DirectoryReader();
	  try {
		dr.readFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public void readFile() throws IOException
	{
		 
		try 
		{
			br = new BufferedReader(new FileReader(a));
			StringBuffer sbf = new StringBuffer();
			String str = null;
			while((str=br.readLine())!=null)
			{
				sbf.append(str);
			}
			System.out.println(sbf.toString());
			
			char[] c = sbf.toString().toCharArray();
			
			for(int i=0;i<c.length;i++)
			{
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null)
			{
			   br.close();
			}
		}
		
	}

}
