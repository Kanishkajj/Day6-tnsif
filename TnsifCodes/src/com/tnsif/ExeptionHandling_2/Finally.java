package com.tnsif.ExeptionHandling_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter an alphabet : ");
			char ch = scanner.next().charAt(0);

			if (!Character.isLetter(ch)) {
				throw new InputMismatchException();
			}

			ch = Character.toLowerCase(ch);

			if (ch == 'a' || ch == 'e' || ch == 'i' || 
			    ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a Vowel");
			} else {
				System.out.println(ch + " is a Consonant");
			}

			return;
		} catch (InputMismatchException e) {
			System.err.println("Invalid input... Please enter an alphabet.");
		} finally {
			System.out.println("In Finally....");
			scanner.close();
		}
	}
}
