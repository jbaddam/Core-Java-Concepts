package com.bootcamp.corejava.oop.interfaces.lab2;

/**
 * @author Jagan Reddy
 * CharacterDemo class implementing java.lang.CharSequence interface
 */
public class CharacterDemo implements java.lang.CharSequence  {
	
	private String str;
	
   public CharacterDemo(String str){
	this.str=str;
    }

	/* (non-Javadoc)
	 * @see java.lang.CharSequence#charAt(int)
	 * this method will give the position on of character in string
	 * in reverse order
	 */
	@Override
	public char charAt(int index) {
		
		if ((index < 0) || (index >= str.length())) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return str.charAt(str.length() - 1 - index);
	}

	/* (non-Javadoc)
	 * @see java.lang.CharSequence#length()
	 * This method will return the length of string
	 */
	@Override
	public int length() {
		return str.length();
	}

	/* (non-Javadoc)
	 * @see java.lang.CharSequence#subSequence(int, int)
	 * this method will return the character sequence in reverse order
	 */
	@Override
	public CharSequence subSequence(int start, int end) {
		
		StringBuilder sub = new StringBuilder(str.subSequence((str.length() - 1 - end), (str.length() - 1 -start)));
		return sub.reverse();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * this method will return the string in reverse
	 */
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(this.str);
		return s.reverse().toString();
	}
	
	
	
	public static void main(String[] args) {
		
		CharacterDemo demo = new CharacterDemo("jaganreddy");
		
		System.out.println(demo.subSequence(4, 9));
		System.out.println(demo.charAt(0));
		System.out.println(demo.length());
		System.out.println(demo.toString());
		
		
		
	}

}
