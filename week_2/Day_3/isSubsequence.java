public class isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        System.out.println(i == s.length());
    }
}
