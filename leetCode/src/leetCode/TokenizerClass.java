package leetCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
@SuppressWarnings("unused")
public class TokenizerClass {


		private static FileWriter writer;

		public static void main(String args[]) throws IOException{
			
			FileReader fr = new FileReader("C:\\Users\\twonk\\Desktop\\outputfile.txt"); 
			BufferedReader br = new BufferedReader(fr); 
			String s; 
			ArrayList<String> output = new ArrayList<String>();
			
			while((s = br.readLine()) != null) { 
				//String tokens[] =
						StringTokenizer  st = new StringTokenizer(s);
						int x=1;
			     while (st.hasMoreTokens()) {
			    	String temp=  st.nextToken();
			    	if((x%3)==0){  
			    		//System.out.println(temp);
			    		output.add(temp);
			    		}
			    	 
			      
			    x++ ;
			     }
		
			} 
			fr.close(); 
			for(int x=0;x<output.size();x++){
				String split = output.get(x).substring(2);
				System.out.println(split);}
		
		} 
		
		

}
