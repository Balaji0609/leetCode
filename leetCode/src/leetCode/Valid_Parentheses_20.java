package leetCode;
import java.util.*;
public class Valid_Parentheses_20 
{
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(!st.empty() && c == st.peek())
                st.pop();
            else
            {
                if(c == '(')
                    st.push(')');
                else if(c == ')')
                    st.push('(');
                else if(c == '}')
                    st.push('{');
                else if(c == '{')
                    st.push('}');
                else if(c == '[')
                    st.push(']');
                else if(c == ']')
                    st.push('[');
            }
        }
        return st.empty();   
    }
}
