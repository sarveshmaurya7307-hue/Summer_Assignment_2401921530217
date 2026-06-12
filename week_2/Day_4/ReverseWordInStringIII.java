public class ReverseWordInStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            ans.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(ans.toString().trim());
    }
}
