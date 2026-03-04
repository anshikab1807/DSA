class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) {
            return "";
        }
        Map<Character,Integer> charCount=new HashMap<>();
        for(char ch:t.toCharArray()) {
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        int target=t.length();
        int[] minWindow={0,Integer.MAX_VALUE};
        int start=0;
        for (int end=0;end<s.length();end++) {
            char ch=s.charAt(end);
            if (charCount.containsKey(ch) && charCount.get(ch)>0) {
                target--;
            }
            charCount.put(ch,charCount.getOrDefault(ch,0)-1);
            if (target==0) {
                while(true) {
                    char charAtStart=s.charAt(start);
                    if (charCount.containsKey(charAtStart) && charCount.get(charAtStart)==0) {
                        break;
                    }
                    charCount.put(charAtStart,charCount.getOrDefault(charAtStart,0)+1);
                    start++;
                }
                if (end-start<minWindow[1]-minWindow[0]) {
                    minWindow[0]=start;
                    minWindow[1]=end;
                }
                charCount.put(s.charAt(start),charCount.getOrDefault(s.charAt(start),0)+1);
                target++;
                start++;
            }
        }
        return minWindow[1] >= s.length() ? "" : s.substring(minWindow[0], minWindow[1] + 1);        
    }
}