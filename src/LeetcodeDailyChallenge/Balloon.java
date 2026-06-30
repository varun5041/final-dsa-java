package LeetcodeDailyChallenge;

public class Balloon {
    static void main(String[] args) {
        String text = "leetcode";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int bCount=0;
        int aCount=0;
        int lCount=0;
        int oCount=0;
        int nCount=0;
        int AnsCount=0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)=='b') {

                    bCount++;

            }
            if (text.charAt(i)=='a') {
                aCount++;
            }
            if (text.charAt(i)=='l') {
                    lCount++;
            }
            if (text.charAt(i)=='o') {
                    oCount++;
            }
            if (text.charAt(i)=='n') {
                nCount++;
            }
        }
        int[] arr = {bCount, aCount, lCount / 2, oCount / 2, nCount};

        int ans = Integer.MAX_VALUE;

        for (int x : arr) {
            ans = Math.min(ans, x);
        }

        return ans;
    }


}
