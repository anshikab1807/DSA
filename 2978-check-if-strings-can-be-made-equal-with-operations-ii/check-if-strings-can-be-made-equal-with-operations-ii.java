class Solution {
    public boolean checkStrings(String s1, String s2) {
        char[] s1Even=new char[26];
        char[] s2Even=new char[26];
        char[] s1Odd=new char[26];
        char[] s2Odd=new char[26];
        int n=s1.length();
        for(int i=0;i<n;i+=2){
            s1Even[s1.charAt(i)-'a']++;
            s2Even[s2.charAt(i)-'a']++;
        }
        for(int i=1;i<n;i+=2){
            s1Odd[s1.charAt(i)-'a']++;
            s2Odd[s2.charAt(i)-'a']++;
        }
        return Arrays.equals(s1Even,s2Even) && Arrays.equals(s1Odd,s2Odd);
        
    }
}