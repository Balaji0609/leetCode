package leetCode;

public class Complex_Number_Multiplication_537 
{
    public String complexNumberMultiply(String a, String b) 
    {
        String[] firstC = a.split("[+]");
        String[] secondC = b.split("[+]");
        int aC = Integer.parseInt(firstC[0]);
        int bC = Integer.parseInt((firstC[1].split("i"))[0]);
        int cC = Integer.parseInt(secondC[0]);
        int dC = Integer.parseInt((secondC[1].split("i"))[0]);
        return Integer.toString(((aC*cC) - (bC*dC))) +"+"+ Integer.toString(((aC*dC) + (bC*cC))) + "i";
    }
}
