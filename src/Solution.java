public class Solution {
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        //A test input
        System.out.println(sol.solution("4  -3-5678-756"));
    }
    public String solution(String S)
    {
        //This removes any space or dash away and keeps just numbers
        String aux = "";
        for(int i = 0; i < S.length(); i++)
        {
            if((S.charAt(i) != ' ') && (S.charAt(i) != '-'))
            {
                aux += S.charAt(i);
            }
        }
        
        String aux2 = "";
        if(aux.length() % 3 == 0)
        {
            for (int i = 0; i < aux.length();)
            {
                if((i % 3 == 0) && (i != 0))
                {
                    aux2 += "-";
                    aux2 += aux.charAt(i);
                }
                else
                {
                    aux2 += aux.charAt(i);
                }
                i++;
            }
        }
        else
        {
            for (int i = 0; i < aux.length()-2;)
            {
                if((i % 3 == 0) && (i != 0))
                {
                    aux2 += "-";
                    aux2 += aux.charAt(i);
                }
                else
                {
                    aux2 += aux.charAt(i);
                }
                i++;
            }
            aux2 += "-" + aux.charAt(aux.length()-2) + aux.charAt(aux.length()-1);
        }
        return (aux2);
    }
}