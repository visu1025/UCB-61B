package com.viswanath.homework1;

import java.io.*;

public class Nuke2 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String inputline = keyboard.readLine();
		
		int length= inputline.length();
		char[] inputLine = inputline.toCharArray();
		
		for(int i=0; i<length; i++)
		{
			if(i!=1)
			System.out.print(inputLine[i]);
		}
	}
}
