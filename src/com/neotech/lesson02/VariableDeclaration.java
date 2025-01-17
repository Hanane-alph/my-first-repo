package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// Data type      Name/Identifier      Operator      value
		
		// 1st way to declare and assign
		int number = 25; // declaring and assigning a value
		 // 2nd way
		//we declare first then assign before we use the variable
		
		int number2; // i have  an integer variable called number2

		//this cause a compiler error--> number2 value is not given
		
		//System.out.println(number2);
		number2 =20;
		System.out.println(number2);
		// we can declare multiple variables in one line
		char var1, var2, var3;
		//the upper declaration is exactly the same as:
	   // char var1
	    //char var2
		//char var3
		var1 = '@';
				var2 = '#';
		var3 = '!';
		
		System.out.println(var1); //at this point var1 =@
		// i will re-assign a value to var1
		
		var1 ='$';
		
		System.out.println(var1);// at this point var1 = $
		// can i re-assign the value of number2? yes!
		number2 = 50;
		System.out.println(number2);
		
		
		

	}

}
