package Strings.LeetcodeStrings;

import java.util.Arrays;

public class StringCompression {
    static void main(String[] args) {

        char[] chars = {'a','a','a','b','b','a','a'};
        System.out.println(compressChars2(chars));
    }

    private static int compressChars(char[] chars) {
        int n = chars.length;
        if(n==1){
            return 1;
        }
        int ans=1;
        int i = 0;
        int j = 0;
        int count = 1;
        while(i<n && j<n-1){
            j=i+1;
            while(j<n && chars[j]==chars[i]){
                count++;
                j++;

            }
            if(count>1 && count <10) {
                i++;
                chars[i] = (char) (count + '0');

            }else if(count>9){
                int index =0;
                String numberCount = String.valueOf(count);
                while(index < numberCount.length()){
                    char first = numberCount.charAt(index);
                    i++;
                    chars[i]=first;
                    index++;
                }
            }
            ans=i+1;
            i++;
            chars[i]=chars[j];
            count = 1;
        }

        System.out.println(Arrays.toString(chars));

        return ans;
    }

    private static int compressChars2(char[] chars) {
        int n = chars.length;
        int index=0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int count = 0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }

            if(count==1){
                chars[index++]=ch;
            }else {
                chars[index++]=ch;
                String countStr = String.valueOf(count);
                for (char digit : countStr.toCharArray()){
                    chars[index++]=digit;
                }
            }
            i--;
        }

        System.out.println(Arrays.toString(chars));
        return index;
    }





}
