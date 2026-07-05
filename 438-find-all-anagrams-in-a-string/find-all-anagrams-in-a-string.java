class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        
        }
        int[] pf=new int[26];
        int[] w=new int[26];
        for(char ch :p.toCharArray()){
            pf[ch-'a']++;
        }
        int left=0;
        for(int right=0;right<s.length();right++){
            w[s.charAt(right)-'a']++;
            if(right-left+1 > p.length()){
                w[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(w,pf)){
                ans.add(left);
            }
        }
        return ans;
    }
}