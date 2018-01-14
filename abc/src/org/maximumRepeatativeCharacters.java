package self;

import java.util.HashMap;
import java.util.Map;

public class maximumRepeatativeCharacters {

	public static Object[] maxi(String a)
	{
		Object[] val=new Object[2];
		char[] acbtoarray=a.toCharArray();
		
		Map<Character, Integer> hm=new HashMap<Character, Integer>();

		for(char val1: acbtoarray)
		{
			if(hm.containsKey(val1))
				{
					hm.put(val1, hm.get(val1)+1);
				}
				else
				{
					hm.put(val1, 1);
				}
		}
		int max=0;
		char car = 0;
		for(Map.Entry<Character, Integer> e: hm.entrySet())
		{
			if(e.getValue()>max)
			{
				max=e.getValue();
				car=e.getKey();
			}
		}
		val[0]=car;
		val[1]=max;
		return val;
	}

	public static void main(String[] args) 
	{		
		String abc="asdadsaaaaancnnnncnjdhhfndhhnd";
		Object[]res=maximumRepeatativeCharacters.maxi(abc);
		System.out.println(res[0]+"="+res[1]);
	}

}
