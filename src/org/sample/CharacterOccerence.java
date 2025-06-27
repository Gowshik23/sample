package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccerence 
{
public static void main(String[] args) {
	String s="malayalam";
	Map<Character, Integer> charcount=new LinkedHashMap<Character, Integer>();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(charcount.containsKey(c))
				{
			charcount.put(c, charcount.get(c)+1);
				}
		else {
			charcount.put(c, 1);
		}
	}
}
}
