package dizivedönguornegi;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<5 ; i++) 
		{
			System.out.println("Enter the value");
			a[i]=sc.nextInt();
	    }
		
		for(i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}

}
}