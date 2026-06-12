public class RepeatedSubstringPattern {
     public static void main(String[] args) {
        String s = "abab";

        String str = s + s;
        boolean ans = str.substring(1, str.length() - 1).contains(s);

        System.out.println(ans);
    }
}
