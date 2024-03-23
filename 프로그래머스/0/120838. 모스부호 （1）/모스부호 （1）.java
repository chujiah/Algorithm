import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String,String> map = new HashMap<>(Map.of(
                ".-", "a", "-...", "b", "-.-.", "c", "-..", "d", ".", "e", "..-.", "f",
                "--.", "g", "....", "h", "..", "i", ".---", "j"
        ));

        map.putAll(Map.of("-.-","k",".-..","l",
                "--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r",
                "...","s","-","t"));

        map.putAll(Map.of("..-","u","...-","v",".--","w","-..-","x",
                "-.--","y","--..","z"));

        StringBuilder answer = new StringBuilder();
        for (String str : letter.split(" ")) {
            answer.append(map.get(str));
        }

        return answer.toString();
    }
}