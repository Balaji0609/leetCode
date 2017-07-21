package leetCode;

import java.lang.ArrayIndexOutOfBoundsException;


/**
 * Class holds main method in order to test the stack operations.
 * 
 * @author Balaji Chandrasekaran 211 for CSE 360 Spring 2016
 *
 */
public class StackTest1 {
	public static void main(String args[])
	{
		StackData S = new StackData(2);            // creating an instance of the stackdata class
		System.out.println("\n\t*Stack Implementation*");
		System.out.println("\n\tDATA ENCAPSULATION\n");
		System.out.println("\n INITIAL SIZE OF STACK");
		System.out.println("Initial count " + StackOps.Count(S));
		System.out.println("\n PUSHING 12");
		StackOps.push(S, 12);
		System.out.println("Top of stack " + StackOps.peek(S));
		System.out.println("\n POPPING 12");
		System.out.println("First pop " + StackOps.pop(S));
		System.out.println("\n PUSHING 14");
		StackOps.push(S, 14);
		System.out.println("\n STACK TOSTRING");
		System.out.println("ToString " + StackOps.toString(S));
		System.out.println("\n STACK PEEK");
		System.out.println("Top " + StackOps.peek(S));
		System.out.println("\n PUSHING 15");
		StackOps.push(S, 15);	
		System.out.println("\n STACK TOSTRING");
		System.out.println("ToString " + StackOps.toString(S));
		System.out.println("\n STACK PEEK");
		System.out.println("Second top " + StackOps.peek(S));
	}
}

/**
 * Class holds the data for the stack it contains the structure of the stack.
 * 
 * @author Balaji Chandrasekaran 211 for CSE 360 Spring 2016
 *
 */

class StackData{
	public int Size;
	public int[] stackArr;
	public int top;
	
	public StackData(int s){					// Constructor for the Stack Class
		Size = s;
		stackArr = new int[Size];
		top = -1;
	}
}


/**
 * Class holds operation implementation for the methods to be performed 
 * on the stack like peek, pop, push, tostring and count.
 * 
 * @author Balaji Chandrasekaran 211 for CSE 360 Spring 2016
 *
 */
class StackOps{
	
	
	public static void push(StackData var, int n){						// Function which handles the push operation of the stack
		try
		{
			var.stackArr[++(var.top)] = n;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("**Stack is full cannot push**");
			System.out.println(e);
			System.exit(1);
		}
	}
	
	public static int pop(StackData var){								// Function handles the pop operation of the stack
		int temp = 0;
		try{
			temp = var.stackArr[(var.top)--]; 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("**Stack is empty cannot pop**");
			System.out.println(e);
			System.exit(1);
		}
		return temp;
	}
	
	public static int Count(StackData var){								// Function returns the size of the stack
		return (var.top + 1);
	}
	
	public static int peek(StackData var){								// Function which returns the top of the stack
		int temp = 0;
		try{
			temp = var.stackArr[var.top];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("**Stack is empty cannot peek**");
			System.out.println(e);
			System.exit(1);
		}
		return temp;
	}
	
	public static String toString(StackData var){		// Function that converts the elements in the stack to a string and returns the string
		String tostring = "";
		for(int i = 0; i < var.top + 1; i++)
				tostring += var.stackArr[i] + " ";
		tostring.trim();
		return tostring;
	}
	
}




