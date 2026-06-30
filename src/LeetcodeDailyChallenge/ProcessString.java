package LeetcodeDailyChallenge;

public class ProcessString {
    static void main(String[] args) {
        String s = "cd%#*#";
        System.out.println(processStr(s));
    }

    public static String processStr(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                str.append(ch);
            }
            else if (ch == '*') {
                if (str.length() > 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            }
            else if (ch == '#') {
                str.append(str.toString());
            }
            else if (ch == '%') {
                str.reverse();
            }
        }
        return str.toString();
    }
}
