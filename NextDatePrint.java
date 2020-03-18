package bootcampday3examples;

import java.time.LocalDate;
import java.util.Scanner;


public class NextDatePrint {

	public static void main(String[] args) {
		 
		System.out.println("Enter input date(YYYY-MM-DD)");
	Scanner sc=new Scanner(System.in);
            String a=sc.nextLine();
		    LocalDate date = LocalDate.parse(a);
		   
		    System.out.println("input date: " + date);
		    System.out.println("nextdaydate:"+date.plusDays(1));
		    
		  }
		}
		    
		 
		

	


