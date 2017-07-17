package leetCode;

import java.util.Map;
import java.util.TreeMap;

public class dictionarySort 
{	
	//global index to track the current position of the index.
	static int globalIndex = 1;
	public static String recurFunc(String in)
	{
		// TreeMap for sorting the string.
		Map<String,String> tMap = new TreeMap<String,String>();
		//StringBuilder for tracking the String.
		StringBuilder stb = new StringBuilder();
		//StringBuilder for tracking the Dictionary.
		StringBuilder valStr = new StringBuilder();
		for(; globalIndex < in.length();globalIndex++)
		{
			if(in.charAt(globalIndex) == ',')
			{
				if(stb.length() == 0)
					continue;
				String[] kVal = (stb.toString()).split(":");
				stb.setLength(0);	
				tMap.put(kVal[0], kVal[1]);
			}
			else if(in.charAt(globalIndex) == '{')
			{
				//valStr since there is inner dictionary.
				globalIndex++;
				valStr.append((recurFunc(in)));				
				tMap.put((stb.deleteCharAt(stb.length()-1)).toString(), valStr.toString());
				stb.setLength(0);
				valStr.setLength(0);
			}
			else if(in.charAt(globalIndex) == '}')
			{
				if(stb.length() != 0)
				{
					String[] kVal = (stb.toString()).split(":");
					stb.setLength(0);
					tMap.put(kVal[0], kVal[1]);
				}
				valStr.append("{");
				for(Map.Entry<String,String> entry : tMap.entrySet())
				{					
					valStr.append(entry.getKey()+":"+entry.getValue()).append(",");
				}
				if(valStr.length()!= 0 && valStr.charAt(valStr.length()-1) == ',')
					valStr.deleteCharAt(valStr.length()-1);
				valStr.append("}");
				break;
			}
			else
			{
				stb.append(in.charAt(globalIndex));	
			}
		}
		return valStr.toString();
	}
	public static void main(String[] args) 
	{
		String v = "{b:{cb:cranberry,bb:blueberry},a:apple,c:cherry}";//"{b:{cb:{cba:cranberry,bba:{cba:{},bba:ball,hba:hollywood},hba:hollywood},bb:hello},a:apple,c:cherry}";
		System.out.println(recurFunc(v));
	}
}

/**if(stb.length() != 0)
{		
	String[] kVal = (stb.toString()).split(":");
	stb = new StringBuilder();	
	tMap.put(kVal[0], kVal[1]);
}

stb.append("{");		
for(Map.Entry<String, String> entry : tMap.entrySet())
{
	stb.append(entry.getKey()+":"+entry.getValue()).append(",");
}
if(stb.length()!= 0 && stb.charAt(stb.length()-1) == ',')
	stb.deleteCharAt(stb.length()-1);		
stb.append("}");
**/
//return "";
