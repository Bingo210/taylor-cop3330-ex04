/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter a noun: " );
        String userNoun = input.nextLine();
        System.out.println( "Enter a verb: " );
        String userVerb = input.nextLine();
        System.out.println( "Enter an adjective: " );
        String userAdj = input.nextLine();
        System.out.println( "Enter an adverb: " );
        String userAdv = input.nextLine();

        System.out.println("Do you " + userVerb + " your " + userAdj + " " +
                userNoun + " " + userAdv + "? " + "That's hilarious!");
    }
}
