public class DecodeString {
    static int i = 0;

    static String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (i < s.length() && s.charAt(i) != ']') {

            if (Character.isLetter(s.charAt(i))) {
                result.append(s.charAt(i++));
            } else {

                int num = 0;

                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i++) - '0');
                }

                i++;

                String decoded = decodeString(s);

                i++;

                while (num-- > 0) {
                    result.append(decoded);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }
    
}
