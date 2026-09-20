class Solution {
    public int longestPalindrome(String s) {
        int odd=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==1)
                odd++;
            else
                odd--;
        }
        if(odd>1)
            return s.length()-odd+1;
        return s.length();
    }
}