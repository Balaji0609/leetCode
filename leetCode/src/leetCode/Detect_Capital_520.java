package leetCode;

public class Detect_Capital_520 
{
    public boolean detectCapitalUse(String word) 
    {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
