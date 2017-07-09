/**
*	Author: Balaji Chandrasekaran
*	CODE 1:	Create permutation of words with duplicates in the input and not in the output.
*/
    static String[] multiset_subset(String multiset) 
    {
        //System.out.println(multiset);
        String[] words = multiset.split(",");
        Arrays.sort(words);
        List<String> result = new ArrayList<String>();
        result.add("");
        int start = 0;
        for(int i = 0 ; i < words.length; i++)
        {
            if(i == 0 || !( words[i].equals(words[i-1]) ))
                start = 0;
            int capacity = result.size();
            for(int j = start; j < capacity; j++)
            {
                StringBuilder temp = new StringBuilder(result.get(j));
                if(temp.length() > 0)
                    temp.append(",").append(words[i]);
                else
                    temp.append(words[i]);
                result.add(temp.toString());
            }
            start = capacity;
        }
        result.remove(0);
        String[] res = result.toArray(new String[result.size()]); 
        return res;
    }


