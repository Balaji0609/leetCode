package leetCode;

import java.util.Stack;

public class Min_Stack_155 
{
    int min;
    Stack<Integer> st;
    /** initialize your data structure here. 
     * @return */
    public void MinStack() 
    {
         min = Integer.MAX_VALUE;
         st = new Stack<Integer>();
        
    }
    
    public void push(int x) 
    {
        if(x <= min)
        {
            st.push(min);
            min = x;
        }
        st.push(x);
    }
    
    public void pop() 
    {
        if(st.pop() == min)
        {
            min = st.pop();
        }
    }
    
    public int top() 
    {
        return st.peek();
    }
    
    public int getMin() 
    {
        return min;
    }
}
