class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ; 
        }
        char[] string_1 = s.toCharArray();
        char[] string_2 = t.toCharArray();

        Arrays.sort(string_1);
        Arrays.sort(string_2);

        return Arrays.equals(string_1 , string_2);
    }
}
