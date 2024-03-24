class Solution {
    public int solution(int n, String control) {
        for (String str : control.split("")) {
            if (str.equals("w")) {
                n+=1;
            } else if (str.equals("s")) {
                n-=1;
            } else if (str.equals("d")) {
                n+=10;
            } else {
                n-=10;
            }
        }
        
        return n;
    }
}