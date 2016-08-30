package com.bootcamp.corejava.oop.accessmodifiers.jaganreddy.abc;

/**
 * @author Jagan Reddy
 *
 */
public class A {
	
	 public int i;
	 private int j;
	 int k;
	 protected int l;
	 
	
	 
	 /**
	 * We can access all the variable in the current class
	 */
	public  int add(){
		 
		 int sum = i+j+k+l;
		 return sum;
		 
	 }
	
/*	
    | Class | Package | Subclass | World
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧覧+覧覧覧�
public      |   +   |    +    |    +     |   +
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧覧+覧覧覧�
protected   |   +   |    +    |    +     |
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧覧+覧覧覧�
no modifier |   +   |    +    |          |
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧覧+覧覧覧�
private     |   +   |         |          |

+ : accessible
  : not accessible
  
*/

}
