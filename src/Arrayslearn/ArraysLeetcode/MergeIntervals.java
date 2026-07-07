package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    static void main(String[] args) {
        int[][] intervals = {
                {1,4},
                {0,2},
                {3,5}
        };
        System.out.println(Arrays.deepToString(MergeInt(intervals)));
    }

    private static int[][] MergeInt(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int m = intervals.length;
        List<int[]> ans = new ArrayList<>();
        for (int i = 0;i<m;i++){

            if( i==0 || intervals[i][0]>ans.getLast()[1]){
                ans.add(intervals[i]);
            } else if (intervals[i][0]<=ans.getLast()[1]) {
                if(ans.getLast()[1]<intervals[i][1]) {
                    ans.getLast()[1] = intervals[i][1];
                }
            }

        }
        return ans.toArray(new int[ans.size()][]);
    }
}
