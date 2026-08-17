package Recursion.Questions.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSetPattern {
    static void main(String[] args) {
        String str = "abc";
        System.out.println(GetSubStrings(str));
    }

    private static List<String> GetSubStrings(String str) {
        String processed="";
        List<String> ans = new ArrayList<>();

//        ans= Subsets1(str,processed,ans);
        ans=Subsets2(str,processed);
        return ans;

    }

    private static List<String> Subsets1(String str, String processed, List<String> ans) {
        if(str.isEmpty()){
            ans.add(processed);
            return ans;
        }
        ans= Subsets1(str.substring(1), processed + str.charAt(0), ans);

        ans = Subsets1(str.substring(1), processed, ans);

        return ans;
    }

    private static List<String> Subsets2(String str, String processed) {
        List<String> ans = new ArrayList<>();
        if(str.isEmpty()) {
            ans.add(processed);
            return ans;
        }
        ans.addAll(Subsets2(str.substring(1), processed + str.charAt(0)));

        ans.addAll(Subsets2(str.substring(1), processed));

        return ans;
    }
}
