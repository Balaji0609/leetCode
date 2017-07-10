/**	Author: Balaji Chandrasekaran.
*	CODE 2: Nested Dictionary Sorting.
*/
    static int globalIndex = 1;
    static String sort_entries(String input) 
    {
        Map<String,String> treeMap = new TreeMap<String,String>();
        StringBuilder keyValue = new StringBuilder();
        StringBuilder dictionary = new StringBuilder();
        for(;globalIndex < input.length();globalIndex++)
        {
            if(input.charAt(globalIndex) == ',')
            {
                if(keyValue.length() == 0)
                    continue;
                
                String[] temp = (keyValue.toString()).split(":");
                keyValue.setLength(0);
                
                treeMap.put(temp[0],temp[1]);
            }
            else if(input.charAt(globalIndex) == '{')
            {
                globalIndex++;
                
                dictionary.append(sort_entries(input));
                treeMap.put((keyValue.deleteCharAt(keyValue.length()-1)).toString(),dictionary.toString());
                
                keyValue.setLength(0);
                dictionary.setLength(0);
            }
            else if(input.charAt(globalIndex) == '}')
            {
                if(keyValue.length()!= 0)
                {
                    String[] temp = (keyValue.toString()).split(":");
                    keyValue.setLength(0);
                    
                    treeMap.put(temp[0],temp[1]);
                }
                
                dictionary.append("{");
                for(Map.Entry<String,String> entry: treeMap.entrySet())
                {
                    dictionary.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
                }
                if(dictionary.length()!= 0 && dictionary.charAt(dictionary.length()-1) == ',')
                    dictionary.deleteCharAt(dictionary.length()-1);
                dictionary.append("}");
                break;
            }
            else
            {
                keyValue.append(input.charAt(globalIndex));
            }
        }
        return dictionary.toString();
    }