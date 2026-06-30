package Arrayslearn.BinarySearchalgo;

public class charcieling {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};

        System.out.println(nextGreatestLetter(arr,'c'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if (letters[mid]<=target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return letters[start%letters.length];
    }
}
