class Solution {
    public int solution(String str1, String str2) {
        String result = str2.replace(str1, "");
        return result.length() == str2.length() ? 0:1;
    }
}