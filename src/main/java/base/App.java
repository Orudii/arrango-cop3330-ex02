/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rudy Arango
 */
package base;

import java.util.Scanner;

/*Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

        Example Output
        What is the input string? Homer
        Homer has 5 characters.
        Constraints
        Be sure the output contains the original string.
        Use a single output statement to construct the output.
        Use a built-in function of the programming language to determine the length of the string.
*/
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String s = input.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("" + s + " has " + count + " charcters.");
    }
}
