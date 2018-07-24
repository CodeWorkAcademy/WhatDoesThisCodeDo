package com.company;

import java.util.Scanner;

public class PalindromTester {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.println("Palindrome Checker");
	    System.out.println("What phrase would you like to check?");
    	String original = in.nextLine();

	    //Convert to lower case to simplify comparing strings
        String phrase = original.toLowerCase();

        String backwards="";

        //loop through the string backwards starting with the last
        for(int i=phrase.length()-1;i>=0;i--){

            //Extract eacch letter as the next character
            //and build the backwars string
            String letter = phrase.substring(i,i+1);
            backwards +=letter;
        }
        //A palindrome is a word or phrase that is the same forward
        //and backward. This is where we check that.
        if(phrase.equals(backwards)){
            System.out.println(original+" is a palindrome");
        }else{
            System.out.println(original+" is not a palindrome");
        }
    }
}
