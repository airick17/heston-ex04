/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

/*
  create program to make a mad lib
  prompt user for a noun
  get input from user
  prompt user for verb
  get input from user
  prompt user for adjective
  get input from user
  prompt user for adverb
  get input from user
  print out the final mad lib with the users inputs substituted in

  import scanner
  create a new scanner in the class
  use print statement to prompt user for noun
  create a string (noun) and populate it with the users input from keyboard
  use print statement to prompt user for verb
  create a string (verb) and populate it with the users input from keyboard
  print statement to prompt user for adjective
  create a string (adjective) and populate it with the users input from keyboard
  use print statement to prompt user for adverb
  create a string (adverb) and populate it with the users input from keyboard
  use printf to build output and print mad lib to console
 */

import java.util.Scanner; //imports scanner

public class Solution04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious! ", verb,adjective,noun,adverb);
    }
}
