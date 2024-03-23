class Solution {
    public double solution(int balls, int share) {
        double a = 1;
        for (int i = 1; i <= balls; i++) {
            a *= i;
        }
        
        double b = 1;
        for (int i = 1; i <= share; i++) {
            b *= i;
        }
        
        double c = 1;
        for (int i = 1; i <= balls-share; i++) {
            c *= i;
        }
        
        return Math.round(a/(b*c));
    }
}