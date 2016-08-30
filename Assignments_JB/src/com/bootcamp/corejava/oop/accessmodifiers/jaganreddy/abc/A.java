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
————————————+———————+—————————+——————————+———————
public      |   +   |    +    |    +     |   +
————————————+———————+—————————+——————————+———————
protected   |   +   |    +    |    +     |
————————————+———————+—————————+——————————+———————
no modifier |   +   |    +    |          |
————————————+———————+—————————+——————————+———————
private     |   +   |         |          |

+ : accessible
  : not accessible
  
*/

}
