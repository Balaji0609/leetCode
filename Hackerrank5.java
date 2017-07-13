static int[] getRecommendedTweets(int[][] followGraph_edges, int[][] likeGraph_edges, 
                                  int targetUser, int minLikeThreshold) {
    ArrayList<Integer> tempfollower = new ArrayList<Integer>();
    int temptweetid = 0;
    Map<Integer, Integer> tweets = new HashMap<Integer, Integer>();
    int count = 0;
    int r[];
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i=0; i<followGraph_edges.length; i++) {
        if (followGraph_edges[i][0] == targetUser) {
            tempfollower.add(followGraph_edges[i][1]);
        }
    }
    for(int i=0; i<likeGraph_edges.length; i++) {
        if (tempfollower.contains(likeGraph_edges[i][0])) {
            temptweetid = likeGraph_edges[i][1];
            if (tweets.containsKey(temptweetid)) {
                count = tweets.get(temptweetid);
                tweets.put(temptweetid,count+1);
            }
            else {
                tweets.put(temptweetid,1);
            }
        }
    }
    Iterator it = tweets.entrySet().iterator();
    int t;
    while(it.hasNext()) {
        Map.Entry pair = (Map.Entry) it.next();
        t = (int)pair.getValue();
        if (t >= minLikeThreshold) {
            t = (int)pair.getKey();
            result.add(t);
        }
    }
    r = new int[result.size()];
    for (int i=0; i<result.size(); i++) {
        r[i] = (int)result.get(i);
    }
    return r;
}