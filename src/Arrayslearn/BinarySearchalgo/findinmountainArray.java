package Arrayslearn.BinarySearchalgo;
public class findinmountainArray {
    public static void main(String[] args) {
//        int[] arr={0,1,2,4,2,1};
//
//        System.out.println(findInMountainArray(arr,3));
    }

//    public static int findInMountainArray(int target, MountainArray mountainArr){
//        int peakelement=peakIndexInMountainArray(mountainArr);
//
//        int ascendingindex=binarysearchfor(mountainArr,target,peakelement,true);
//        int descendingindex=binarysearchfor(mountainArr,target,peakelement,false);
//
//        if(ascendingindex==-1) {
//            return descendingindex;
//        }else if (descendingindex==-1){
//            return ascendingindex;
//        }
//        int ans = Math.min(ascendingindex,descendingindex);
//        return ans;
//    }
//
//    public static int peakIndexInMountainArray(MountainArray mountainArr) {
//        int start = 0;
//        int end = mountainArr.length()-1;
//        int ansindex = 0;
//        while(end!=start){
//
//            int mid = start+(end-start)/2;
//            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
//                end=mid;
//            } else if (mountainArr.get(mid)<mountainArr.get(mid+1)) {
//                start=mid+1;
//            }
//        }
//
//        return start;
//
//    }
//
//    private static int binarysearchfor(MountainArray mountainArr,int target,int peakindex,boolean isascending) {
//       int start;
//       int end;
//
//        if(isascending){
//             start=0;
//            end=peakindex;
//       }else{
//            start=peakindex+1;
//            end=mountainArr.length()-1;
//       }
//        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
//        while(end>=start){
//
//            int mid = start+(end-start)/2;
//            if(mountainArr.get(mid)==target){
//                return mid; //target found
//            }else if(isAsc){
//                if(target>mountainArr.get(mid)){
//                    start=mid+1; //right side search space
//                }else{
//                    end=mid-1;    //left side search space
//                }
//            }else {
//                if(target<mountainArr.get(mid)){
//                    start=mid+1; //right side search space
//                }else{
//                    end=mid-1;    //left side search space
//                }
//
//            }
//        }
//        return -1;
//    }
//    }
}
