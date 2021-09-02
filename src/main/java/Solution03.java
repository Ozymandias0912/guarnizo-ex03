/*
 *  UCF COP3330 Fall 2021 Assignment 1 exercise03 Solution03
 *  Copyright 2021 Juan Guarnizo
 */

/*
* Pseudocode
*
* create string quote.
* create string author.
*
* create input variable.
*
* print message: "What is the quote?"
* set quote variable equal to user's input.
*
* print message: "Who said it?"
* set author variable equal to user's input.
*
* print message: "author says "quote"
*
*
* */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {

        String quote;
        String author;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the quote?");
        quote = input.nextLine();

        System.out.println("Who said it?");
        author = input.nextLine();

        System.out.println( author + " says, " + "\"" + quote + "\"");
    }
}
