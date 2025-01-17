package com.neotech.lesson02;

public class PrimitiveDataType {

	public static void main(String[] args) {
	// Data type      Name/Identifier      Operator      value
		
 //let's define an age variable
		byte age =30;  // within range
		
		
		//byte age1 =128; bigger value in to small box... doesn't work.
		// this causes compiler error
		
	  short citiesCount = 15000;
	System.out.println(age);
	System.out.println(citiesCount);
	int var1 =5; //it works but with a big container for a small value
			//how can we decide which data  type to use?
	//--> think about possible ranges you will have
	long var2 = 1056564782145122334L; 
	System.out.println(var1);
	System.out.println(var2);
	//how to use decimal number
	double var3=45.25;// 45.25 is a literal double
	float var4= 45.25f;
	System.out.println(var3);
    System.out.println(var4);	
    char dollar = '$';
    char a ='1';
    char space = ' ';
    //boolean is either a true or false
    boolean pass= true;
    System.out.println(dollar);
    System.out.println(a);
    System.out.println(space);
    System.out.println(pass);
	
	
	
	
	}

}
