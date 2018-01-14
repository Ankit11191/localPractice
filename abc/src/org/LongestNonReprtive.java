package self;

public class LongestNonReprtive 
{
	static final int NO_OF_CHARS = 256;
    static int longestUniqueSubsttr(String str)
    {
        int n = str.length(), prev_index, i, cur_len = 1, max_len = 1; 
        int visited[] = new int[NO_OF_CHARS];
        
        for (i = 0; i < NO_OF_CHARS; i++) 
        {
            visited[i] = -1;
        } 
        visited[str.charAt(0)] = 0;
        for(i = 1; i < n; i++)
        {
            prev_index = visited[str.charAt(i)];
            System.out.println(i+","+prev_index+","+(i - cur_len));
            if(prev_index == -1 || i - cur_len > prev_index)
            {    
            	cur_len++;
            }
            
            else
            {
                if(cur_len > max_len)
                    max_len = cur_len;
                cur_len = i - prev_index;
            }
            visited[str.charAt(i)] = i;
        }
        if(cur_len > max_len)
            max_len = cur_len;
         
        return max_len;
    }
     
    /* Driver program to test above function */
    public static void main(String[] args) 
    {
        String str = "ABDEFGhiABEF";
        System.out.println("The input string is "+str.toUpperCase());
        int len = longestUniqueSubsttr(str);
        System.out.println("The length of "
                + "the longest non repeating character is "+len);
    }

}
