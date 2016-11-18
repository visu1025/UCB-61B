package com.viswanath.homework1;
import java.net.*;
import java.io.*;

public class OpenCommercial {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the URL you want to visit:");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.flush();
		URL website = new URL(keyboard.readLine());

		int count = 5;
		for (int i = 0; i < 5; i++) {
			BufferedReader inputlines = new BufferedReader(new InputStreamReader(website.openStream()));
			String Input;
			for (int j = 0; j < count; j++) {

				Input = inputlines.readLine();
				if (j == count - 1)
					System.out.println(Input);
			}

			count--;
		}

	}
}
