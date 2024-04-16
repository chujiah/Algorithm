class Solution {
    public int solution(String number) {
        int a = 0;
        for (String s : number.split("")) {
            a += Integer.parseInt(s);
        }
        
        return a % 9;
    }
}