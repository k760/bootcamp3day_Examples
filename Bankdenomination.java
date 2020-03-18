package bootcampday3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bankdenomination {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// storing all the denominations in an array
		int a[]={ 2000, 500, 200,100, 50, 5, 2 };
		
		System.out.print("Enter any Amount: ");
		int amount = Integer.parseInt(br.readLine());
		// Making a copy of the amount
		int tot = amount;
		int totalNotes = 0, count = 0;

		System.out.println("\nDENOMINATIONS: \n");
	
		//check for each 7 different types.
		for (int i = 0; i < 7; i++) 
		{
			// counting number of den[i] notes
			count = amount / a[i];
			
			// printing that denomination if the count is not zero
			if (count != 0)
			{
				System.out.println(a[i] + "\tx\t" + count + "\t= " + a[i] * count);
			}
			// finding the total number of notes
			totalNotes = totalNotes + count;
			// finding the remaining amount whose denomination is to be found
			amount = amount % a[i];
		}

		System.out.println("--------------------------------");
		System.out.println("TOTAL\t\t\t= " + tot);
		System.out.println("--------------------------------");
		System.out.println("Total Number of Notes\t= " + totalNotes);
	}

}

