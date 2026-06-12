import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
     public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}
