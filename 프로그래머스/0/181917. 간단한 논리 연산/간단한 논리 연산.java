class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean a = x1 == x2 && x1 == false ? false:true;
        boolean b = x3 == x4 && x3 == false ? false:true;
        
        return a == b && a == true ? true:false;
    }
}