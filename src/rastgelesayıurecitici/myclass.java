package rastgelesayýurecitici;

import java.util.Scanner;
import java.util.Random;

public class myclass {

	public static void main(String[] args) {
		
		Random dice = new Random();
		int number;
		
		for(int i=0; i<=10 ; i++) 
		{
			
			number=dice.nextInt(6);
			System.out.println(number);
		}
		

	}

}
