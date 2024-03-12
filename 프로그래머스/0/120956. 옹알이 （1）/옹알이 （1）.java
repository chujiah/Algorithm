import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] babbling) {
        List<String> list = List.of("aya", "ye", "ma", "woo");
		return Arrays.stream(babbling).map(v -> {
			final String[] a = {v};
			list.forEach(te -> {
				if (a[0].contains(te)) {
					a[0] = a[0].replace(te, "#");
				}
			});
			return a[0];
		}).filter(v -> "".equals(v.replaceAll("#", ""))).collect(Collectors.toList()).size();
    }
}