package Arrayslearn.ArraysLeetcode;

public class PrefixString {
    static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String ans="";
        for (int i = 0; i < strs[0].length(); i++) {
            boolean isequal=false;
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length()) {
                    isequal = false;
                    break;
                } else if ((ch == strs[j].charAt(i))) {
                    isequal = true;
                } else {
                    isequal = false;
                    break;
                }
            }
            if (isequal == true) {
                ans = ans + ch;
            } else {
                break;
            }
        }


        return ans;
    }
}