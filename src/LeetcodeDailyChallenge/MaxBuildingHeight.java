package LeetcodeDailyChallenge;

import java.util.*;

public class MaxBuildingHeight {
    static void main(String[] args) {
        int n = 10;
        int[][] restrictions={
                {5,3},
                {2,5},
                {7,4},
                {10,3}
        };
        System.out.println(maxBuilding(n,restrictions));
    }
    public static int maxBuilding(int n, int[][] restrictions) {
        List<int[]> restrictionsarr = new ArrayList<>();
        restrictionsarr.add(new int[]{1,0});
        for(int[] e : restrictions){
            restrictionsarr.add(e);
        }

        boolean containsLastRestriction=false;
        for (int[] e:restrictionsarr){
            if(e[0]==n){
                containsLastRestriction=true;
            }
        }
        if(!containsLastRestriction){
            restrictionsarr.add(new int[]{n,Integer.MAX_VALUE});
        }
        restrictionsarr.sort(new AscendingComparatorForArrayIndexOne());


        for (int i=1;i<restrictionsarr.size();i++){
            int distance = (restrictionsarr.get(i))[0]-(restrictionsarr.get(i-1))[0];
            int possibleHeight=restrictionsarr.get(i-1)[1]+distance;
            int CurrentRestriction=restrictionsarr.get(i)[1];

            if(CurrentRestriction>possibleHeight){
                CurrentRestriction=possibleHeight;
                restrictionsarr.get(i)[1]=CurrentRestriction;
            }
        }

        for (int i = restrictionsarr.size() - 2; i >= 0; i--){
            int distance = (restrictionsarr.get(i+1))[0]-(restrictionsarr.get(i))[0];
            int possibleHeight=restrictionsarr.get(i+1)[1]+distance;
            int CurrentRestriction=restrictionsarr.get(i)[1];

            if(CurrentRestriction>possibleHeight){
                CurrentRestriction=possibleHeight;
                restrictionsarr.get(i)[1]=CurrentRestriction;
            }
        }
        int ans=0;
        for (int i = 0;i<restrictionsarr.size()-1;i++){
            int id1=restrictionsarr.get(i)[0];
            int h1=restrictionsarr.get(i)[1];

            int id2=restrictionsarr.get(i+1)[0];
            int h2=restrictionsarr.get(i+1)[1];

            int diff=id2-id1;

            int peak=(h1+h2+diff)/2;
            ans = Math.max(ans,peak);
        }

        return ans;
    }
}

class AscendingComparatorForArrayIndexOne implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
        return Integer.compare(o1[0],o2[0]);
    }

}