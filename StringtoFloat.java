package bootcampday3examples;

import java.util.Scanner;

public class StringtoFloat {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
try{
Float r=new Float(s.substring(0,4));

	System.out.println("r="+r);

}
catch(NumberFormatException a){
		System.out.println("r=0");
	}

catch(Exception t){
	Float r1=new Float(s.substring(0,3));
	System.out.println("r="+r1);
	
}
	}
}




