class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        int w = p.length();
        for (int i = 0; i < w; i++) {
            sCount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }
        for (int i = w; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - w) - 'a']--;
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - w + 1);
            }
        }
        return result;
    }
}
