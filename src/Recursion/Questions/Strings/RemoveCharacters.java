package Recursion.Questions.Strings;


public class RemoveCharacters {
    static void main(String[] args) {
//        String str="banana";
//        System.out.println(removeChar2(str,'a'));
        System.out.println(RemoveArrayOfChars("occurrence","car"));
    }

    private static String removeChar(String str, char ch) {
        String ans="";
        return RemoveCharhelper(str,ch,ans);
    }

    private static String RemoveArrayOfChars(String str1,String str2){
        for (int i=0;i<str2.length();i++){
            str1=removeChar2(str1, str2.charAt(i));
        }
        return str1;
    }

    private static String RemoveCharhelper(String str, char ch, String ans) {
        if(str.isEmpty()){
            return ans;
        }

        if(str.charAt(0)!=ch){
            ans=ans+str.charAt(0);
        }

        return RemoveCharhelper(str.substring(1,str.length()),ch,ans);
    }


    private static String removeChar2(String str , char ch){
        String ans ="";
        if(str.isEmpty()){
            return ans;
        }

        if(str.charAt(0)!=ch){
            ans=ans+str.charAt(0);
        }

        return ans + removeChar2(str.substring(1,str.length()),ch);
    }
}
