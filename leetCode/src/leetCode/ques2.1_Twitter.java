
    static int maxMoves(String s, String t) 
    {
        int result = 0;
        int curlevel = 1;
        int nextlevel = 0;
        StringBuilder stbS = new StringBuilder(s);
        StringBuilder stbT = new StringBuilder(t);
        Queue<StringBuilder> q = new LinkedList<StringBuilder>();
        q.offer(stbS);
        while(!q.isEmpty())
        {
            if(curlevel == 0)
            {
                result++;
                curlevel = nextlevel;
                nextlevel = 0;
            }            
            stbS = q.poll();
            curlevel--;
            
            int startIndex = stbS.indexOf(t);
            int endIndex = stbS.lastIndexOf(t);
            if(startIndex != -1)
            {
                StringBuilder res1 = new StringBuilder(stbS);
                q.offer(res1.delete(startIndex,startIndex + stbT.length()));
                nextlevel++;
            }
            if(endIndex != -1)
            {
                StringBuilder res2 = new StringBuilder(stbS);
                q.offer(res2.delete(endIndex,endIndex + stbT.length()));
                nextlevel++;
            }
        }
        return result;
    