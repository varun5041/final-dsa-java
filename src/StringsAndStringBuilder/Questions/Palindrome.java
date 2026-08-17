package StringsAndStringBuilder.Questions;

public class Palindrome {
    static void main(String[] args) {
        String str = "helllleh";

        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        if ( str==null || str.length()==0){
            return true;
        }
        int start = 0;
        int end = str.length()-1;

        while(end>start){
            if(str.charAt(start)!=str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;

    }
}
