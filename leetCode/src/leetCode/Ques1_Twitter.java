 static void computeLPSArray(String pat, int M, int lps[])
    {
        int len = 0;
        int i = 1;
        lps[0] = 0; 
        while (i < M)
        {
            if (pat.charAt(i) == pat.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if (len != 0)
                {
                    len = lps[len-1];
                }
                else
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    static int firstOccurrence(String s, String x) 
    {
        int N = s.length();//N
        int M = x.length();//M
        int lps[] = new int[M];
        int j = 0;
        computeLPSArray(x,M,lps);
        int i = 0;
        while (i < N)
        {
            System.out.println(x.charAt(j));
            if (x.charAt(j) == s.charAt(i) || x.charAt(j) == '*' )
            {
                j++;
                i++;
            }
            if (j == M)
            {
                return i-j;
            }
            else if (i < N && x.charAt(j) != s.charAt(i) && x.charAt(j) != '*')
            {
                if (j != 0)
                    j = lps[j-1];
                else
                    i = i+1;
            }
        }
        return -1;
    }