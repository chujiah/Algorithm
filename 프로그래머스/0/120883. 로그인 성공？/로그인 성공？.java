class Solution {
    public String solution(String[] id_pw, String[][] db) {
        StringBuilder sb = new StringBuilder();
        for (String[] dbInfo : db) {
            if (dbInfo[0].equals(id_pw[0])) {
                sb.append("idPass");
                if (dbInfo[1].equals(id_pw[1])) {
                    sb.append("pwPass");
                }
            }
        }
        
        String result = sb.toString();
        return result.isEmpty() ? "fail" : result.contains("pwPass")? "login":"wrong pw";
    }
}