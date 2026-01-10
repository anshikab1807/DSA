class Solution {
    public static boolean isTrue(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j))
            return false;
            i++; 
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
        String sub ="";
        for(int j=i;j<n;j++){
            sub += s.charAt(j);
            if(isTrue(sub))
            count++;
            }
        }
        return count;
    }
}