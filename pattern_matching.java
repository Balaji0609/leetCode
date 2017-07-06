/**
*	Author: Balaji Chandrasekaran
*	CODE 3:	Naive Pattern matching.(with '.')
*/

Boolean strMatch(String str1, String str2)
{
    if(st1.equals("") || str2.equals(""))
        return true;
    if(str1.length() < str2.length())
        return false;
    int flag = 0;
    for(int i = 0 ; i< str1.length() && flag != 1;i++)
    {
        if(str1.charAt(i) == str2.charAt(0) || str2.charAt(0) == '.' )
        {
            int j = 0;
            int k = i;
            for(; j < str2.length();j++)
            {
                if(str1.charAt(k) == str2.charAt(j) || str2.charAt(j) == '.')
                    k++;
                else
                    break;
            }
            if(j == str2.length())
                flag = 1;
        }
    }
    return flag == 1?true:false;
}

/*
Note: For this problem, do not use regular expression libraries.

Write a function that takes as input two strings, a text to search and a pattern
to locate within the text. The function should output true if the pattern 
matches any substring of the text, and false otherwise.

The text only contains alphanumeric characters and spaces.

The pattern contains alphanumeric characters, spaces, and periods (.). A period 
is a wildcard metacharacter that can match any single character in the text.

Examples:

> match("hello world", "hello")
True

> match("hello world", "hd")
False

> match("hello world", "lo wo")
True

> match("hello world", "goodbye")
False

> match("hello world", "..llo")
True

> match("hello world", "...llo")
False

> match("hello world", "h.l")
True
*/