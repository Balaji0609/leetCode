package leetCode;

/**
 * Class holds main method in order to test the stack operations and
 * also holds another class called stack as inner class which is a
 * private class and consists of the stack structure and its implementation. 
 * 
 * @author Balaji Chandrasekaran 211 for CSE 360 Spring 2016
 *
 */

public class StackTest2 
{
	private class Stack
	{
		private int Size;
		private int[] stackArr;
		private int top;
		public Stack(int s){   								// Constructor for the Stack Class
			Size = s;
			stackArr = new int[Size];
			top = -1;
		}
		public void push(int n){							// Function which handles the push operation of the stack
			try
			{
				stackArr[++(top)] = n;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("**Stack is full cannot push**");
				System.out.println(e);
				System.exit(1);
			}
		}
		
		public int pop(){									// Function handles the pop operation of the stack
			int temp = 0;
			try{
				temp = stackArr[top--]; 
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("**Stack is empty cannot peek**");
				System.out.println(e);
				System.exit(1);
			}
			return temp;
		}
		
		public int Count(){									// Function returns the size of the stack
			return (top + 1);
		}
		
		public int peek(){									// Function which returns the top of the stack
			int temp = 0;
			try{
				temp = stackArr[top];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("**Stack is empty cannot peek**");
				System.out.println(e);
				System.exit(1);
			}
			return temp;
		}
		
		public String toString(){					// Function that converts the elements in the stack to a string and returns the string
			String tostring = "";	
			for(int i = 0; i < top + 1; i++)
					tostring += stackArr[i] + " ";
			tostring.trim();
			return tostring;
		}	
	}
	public static void main(String args[])
	{
		StackTest2 s = new StackTest2();						// Creating an instance of the outer class
		StackTest2.Stack S = s.new Stack(1);					// Creating an instance of the inner class
		System.out.println("\n\t*Stack Implementation*");
		System.out.println("\n\tINFORMATION HIDING\n");
		System.out.println("\n INITIAL SIZE OF STACK");
		System.out.println("Initial count " + S.Count());
		System.out.println("\n PUSHING 12");
		S.push(12);
		System.out.println("Top of stack " + S.peek());
		System.out.println("\n POPPING 12");
		System.out.println("First pop " + S.pop());
		System.out.println("\n PUSHING 14");
		S.push(14);
		System.out.println("\n STACK TOSTRING");
		System.out.println("ToString " + S.toString());
		System.out.println("\n STACK PEEK");
		System.out.println("Top " + S.peek());
		System.out.println("\n PUSHING 15");
		S.push(15);	
		System.out.println("\n STACK TOSTRING");
		System.out.println("ToString " + S.toString());
		System.out.println("\n STACK PEEK");
		System.out.println("Second top " + S.peek());
	}
}
