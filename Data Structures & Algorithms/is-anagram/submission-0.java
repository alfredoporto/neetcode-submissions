class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // by default is initialized with 0s
        int [] charCount = new int[26];

        for (int i=0; i<s.length(); i++) {
            // s string increases
            charCount[s.charAt(i) - 'a']++;
            // t string decreases
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count: charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
