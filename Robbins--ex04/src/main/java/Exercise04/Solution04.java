package Exercise04;

import java.util.Scanner;

/*
Create scanner input: Scanner myObj = new Scanner(System.in);
create Noun string named "Str1" from user input "Enter a noun:";
create verb string named "Str2" from user input "Enter a verb:";
create adjective string named "Str3" from user input "Enter an adjective:";
create adverb string named "Str4" from user input "Enter an adverb:";
Print out Madlib with string substitution and add spaces with +" ";
Put standard phrases in quotes and then add string (+str2 for example);
 */

public class Solution04 {

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 1 program 2 solution
         *  Copyright 2021 Jonathan Robbins
         */

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String str1 = myObj.nextLine();

        System.out.println("Enter a verb: ");
        String str2 = myObj.nextLine();

        System.out.println("Enter an adjective: ");
        String str3 = myObj.nextLine();

        System.out.println("Enter an adverb: ");
        String str4 = myObj.nextLine();

        System.out.println("Do you" +" " +str2+  " "+ "your" +" " + str3  +" " + str1 +" "  + str4+ "? That's so lame.");

    }
}
