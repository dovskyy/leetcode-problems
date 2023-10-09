import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int length = 0;
            Set<Character> uniqueChars = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                uniqueChars.clear();

                for (int j = i; j < s.length(); j++) {
                    if (uniqueChars.contains(s.charAt(j))) {
                        break;
                    }

                    uniqueChars.add(s.charAt(j));
                    length = Math.max(length, uniqueChars.size());
                }
            }

            return length;

        }
    }

}
