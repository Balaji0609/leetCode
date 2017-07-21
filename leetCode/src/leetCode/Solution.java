package leetCode;

import java.util.*;
import java.lang.String;
import java.lang.StringBuilder;

public class Solution {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
			
		StringBuilder strb2;

		String[] strarr = str1.split("@");
		int len = strarr.length;
		if(len > 2){
			System.out.println("wrong");
		}
		String temp = strarr[0];
		char a = temp.charAt(0);
		char b = temp.charAt((temp.length()-1));
		
		strb2 = new StringBuilder().append(a).append("*****").append(b).append(strarr[1]);
		@SuppressWarnings("unused")
		String res = strb2.toString();
		
		 //str2 = str2.replaceAll("\\d", "*");
		 int len1 = str2.length();
		 StringBuilder strbuil = new StringBuilder();
		 int count = 4;
		 
		 for(int j = len1-1; j >= 0 && count != 0; j--){
			 if(Character.isDigit(str2.charAt(j))){
				 strbuil.append(str2.charAt(j));
				 count --;
			 }
		 }
		 int countdigit = 0;
		 for (int i = 0, len2 = str2.length(); i < len2; i++) {
			    if (Character.isDigit(str2.charAt(i))) {
			        countdigit++;
			    }
			}
		 StringBuilder strb = new StringBuilder();
		 strbuil.reverse();
		 if(countdigit > 10){
			 int tp = countdigit - 10;
			 switch(tp){
			 case 1:
				 strb.append("+*-***-***-").append(strbuil.toString());
			 case 2:
				 strb.append("+**-***-***-").append(strbuil.toString());
			 case 3:
				 strb.append("+***-***-***-").append(strbuil.toString());
			 }
		 }
		 else{
			 strb.append(strbuil.toString());
		 }
		 
		//System.out.println("hai how are you");
		// TODO Auto-generated method stub
	}

}
