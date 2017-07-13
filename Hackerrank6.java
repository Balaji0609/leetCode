static int maxLength(int[] a, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> lenList = new ArrayList<Integer>();
        int lastInsterted=0;
		computeSets(a, 0, list, lenList,  lastInsterted);

		System.out.println(list);
        System.out.println(lenList);
		int maxLen = 0;
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) <= k)
				maxLen = Math.max(maxLen, lenList.get(i));
		}
		System.out.println(maxLen);
		return maxLen;
    }
    private static void computeSets(int[] c, int index,
			ArrayList<Integer> list, ArrayList<Integer> lenList, int lastInsterted)
	{
		if (index == c.length)
			return;
		int len = list.size();

		ArrayList<Integer> a;
        int temp = 0;
		for (int i = len-lastInsterted; i < len; i++)
		{
            list.add(list.get(i) + c[index]);
            lenList.add(lenList.get(i)+1);
            temp++;
		}
        lastInsterted = temp;
		list.add(c[index]);
        lenList.add(1);
        lastInsterted++;
		index++;
		computeSets(c, index, list, lenList, lastInsterted);
	}