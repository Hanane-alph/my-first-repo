package com.neotech.lesson02;

public class VariablesJava {

	public static void main(String[] args) {
		// data type      name/identifier    operator    value
		int                 someNumber        =              15;
       // can i display a literal integer?-> yes!
		System.out.println(15); //this is an integer literal
		System.out.println("15");//this is a string literal
		
		// if i want to display/ use someNumber, i use it directly by its name
		System.out.println(someNumber); //this is a variable define a value
		
		System.out.println(someNumber);
		
		// This will cause a compiler error-> var is not defined a variable
		//System.out.println(var);// VAR does'nt  exist in my code
		                        // that means it's not define/declared and assigned a value
	}

}
