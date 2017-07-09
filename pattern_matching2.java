/**
*	Author: Balaji Chandrasekaran
*	CODE 4:	Pattern matching.(with '.' & '?')
**NOT COMPLETED**
*/

Boolean strMatch2(String str1, String str2)
{
    if(str2.contains("??"))
        return false;
    if(str.charAt(0) == '?')
        return false;
    List<String> ls = new ArrayList<String>();
    StringBuilder strb = new StringBuilder();
    
    for(int i = 1 ; i < str2.length();i++)
    {
        if(str2.charAt(i+1) == '?')
        
        
        else
        {
            strb.append(str2.charAt(i));
        }
        
    }
}


/*
The pattern can now contain a question mark (?) metacharacter. A question mark 
is a quantifier that matches the preceding (non-quantifier) character in the
pattern to either 0 or 1 characters in the text. 

Patterns that start with a question mark or contain two consecutive question 
marks should be considered invalid and the function should return false. 
Periods(.) are also still acceptable metacharacters.

Examples:

> match("hello world", "hell?o")
True

> match("hello world", "helll?o")
True

> match("hello world", ".? e l? ll l? o? o x?")
True

> match("hello world", "h??ello")
False

> match("hello world", "?hello")
False


> match("hello world", "hel?l?llo")
True
*/