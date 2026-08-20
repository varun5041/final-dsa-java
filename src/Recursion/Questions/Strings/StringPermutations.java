package Recursion.Questions.Strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    static void main(String[] args) {
        String str = "abcd";
        System.out.println(GetPermutations(str));
//        StringBuilder s = new StringBuilder(str);
//
//        System.out.println(s);
    }


    private static List<String> GetPermutations(String str) {
        List<String> ans = new ArrayList<>();
        String processed="";
        ans = PermutString(processed,str);
        return ans;
    }

    private static List<String> PermutString(String processed, String str) {
        List<String> ans = new ArrayList<>();

        if(str.isEmpty()){
            ans.add(processed);
            return ans;
        }

        for (int i = 0;i<str.length();i++){
//            StringBuilder s = new StringBuilder(str);
//            StringBuilder p = new StringBuilder(processed);
            ans.addAll(PermutString(processed + str.charAt(i)
                    , str.substring(0,i)+str.substring(i+1)
            ));
        }

        return ans;




    }


}
