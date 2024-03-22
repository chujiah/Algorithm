class Solution {
    public int solution(String[] spell, String[] dic) {
        int result = 2;
        for (String d: dic) {
            StringBuilder check = new StringBuilder();
            for (int i = 0; i < spell.length; i++) {
                if (d.contains(spell[i])) check.append(spell[i]);
            }
            
            if (check.length() == spell.length) result = 1;
        }
        
        return result;
    }
}