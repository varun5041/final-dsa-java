package Recursion.Questions.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSequencePattern {
    static void main(String[] args) {
        String str = "abc";
        System.out.println(GetSuquences(str));
    }

    private static List<String> GetSuquences(String str) {
        String processed="";
        List<String> ans = new ArrayList<>();

//        ans= Subseq1(str,processed,ans);
        ans= Subseq3(str,processed);
        return ans;

    }

    private static List<String> Subseq1(String str, String processed, List<String> ans) {
        if(str.isEmpty()){
            ans.add(processed);
            return ans;
        }
        ans= Subseq1(str.substring(1), processed + str.charAt(0), ans);

        ans = Subseq1(str.substring(1), processed, ans);

        return ans;
    }

    private static List<String> Subseq2(String str, String processed) {
        List<String> ans = new ArrayList<>();
        if(str.isEmpty()) {
            ans.add(processed);
            return ans;
        }
        ans.addAll(Subseq2(str.substring(1), processed + str.charAt(0)));

        ans.addAll(Subseq2(str.substring(1), processed));

        return ans;
    }

    private static List<String> Subseq3(String str, String processed) {
        List<String> ans = new ArrayList<>();
        if(str.isEmpty()) {
            ans.add(processed);
            return ans;
        }
        char ch=str.charAt(0);
        ans.addAll(Subseq2(str.substring(1), processed + ch));
        ans.addAll(Subseq2(str.substring(1), processed));
        ans.addAll(Subseq2(str.substring(1), processed + (ch+0)));

        return ans;
    }


}
