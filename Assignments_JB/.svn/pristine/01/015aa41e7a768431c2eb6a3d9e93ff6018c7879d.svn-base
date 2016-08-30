package com.bootcamp.corejava.datatypes.strings.lab1;


/**
 * 
 * @author Jagan Reddy in this class String Manipulations methods are
 *         implemented
 */
public class StringManipulations {

	static String s = " hello how are you? ".trim();

	/*
	 * Returns the number of words in the given String
	 */
	static int stringWordCount() {

		if (s.length() == 0) {
			return 0;
		} else {
			int wordCount = 1;
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) == ' ') {
					wordCount += 1;

				}
			}
			return wordCount;
		}

	}

	/*
	 * Returns the String after replaced hello With HELLO given String
	 */
	static String replaceString() {
		String replace = s.replace("hello", "HELLO");
		return replace;
	}

	/*
	 * Returns True if the given String is same in both directions else returns
	 * False
	 */
	static boolean pallindrom() {
		String pallindrom = "NITIN";
		boolean flag = false;
		for (int i = 0; i < pallindrom.length(); i++) {
			if (pallindrom.charAt(i) == (pallindrom.charAt(pallindrom.length() - 1 - i))) {
				flag = true;
			} else
				flag = false;

		}
		return flag;
	}

	/*
	 * Prints the occurance of A's Positions
	 */
	static void occurenceOfA() {
		String statement = "HELLO HOW ARE YOU AND WHERE ARE YOU";
		System.out.println("A Found in the Statement at Position : ");
		for (int i = 0; i < statement.length(); i++) {
			if (statement.charAt(i) == 'A') {
				System.out.print((i + 1));

			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Number of Words in the given String are : " + stringWordCount());

		System.out.println("Length of the Given String is :" + s.length());

		System.out.println("Given String After replaced with HELLO \n" + replaceString());

		s = s.replaceAll(" ", ",");

		System.out.println("\nReplacing Spaces with comma's \n" + s);

		System.out.println("\nFirst 3 Letters in Given Strin are\n" + s.substring(0, 3));

		String s1 = "hello";

		System.out.println("\nString comparision hello with HELLO (True/False) \n" + s1.equals("HELLO"));

		System.out.println("\nPallindrom ?(True/False)\n" + pallindrom());

		occurenceOfA();
	}
}
