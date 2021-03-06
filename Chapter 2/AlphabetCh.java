/*
 *  Author: Rattymyles
 *  Chapter 2 Fundamentals of Java - A Beginner's Guide 6th Edition.
 *  The purpose of this project will breakdown each line of code to help fellow students and readers.
 *  The Alphabet program will demonstrate handling character variables similer to integers.
 *  Any feedback or comments, please email my address as m.pucknell@gmail.com.
 */

public class AlphabetCh {

	public static void main(String args[]){
		
		for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
		    System.out.println("alphabet now contains: " + alphabet);
		}
		
		for (char number = '0'; number <= '9'; number++){
		    System.out.println("number now contains: " + number);

		}
		
		//ascii value of the alphabet
		// the char forces the integer value to a char value.
		for ( int ascii = 65; ascii <= 90; ascii++){
			System.out.println("ascii value contains: "+ (char)ascii);
		}
		
				
		
	}
}
