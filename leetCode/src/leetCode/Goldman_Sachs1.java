package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Goldman_Sachs1 {
	public static String firstuniquechar(String str){
		Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++ ){
			char temp = str.charAt(i);
			if(hmap.containsKey(temp)){
				hmap.put(temp, hmap.get(temp) + 1);
			}else
			{
				hmap.put(temp, 1);
			}
		}
		for(int j = 0 ;j < str.length();j++){
			char temp1 = str.charAt(j);
			if(hmap.get(temp1) == 1)
				return Character.toString(temp1);
		}
		return null;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
