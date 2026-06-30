package Arrayslearn.BinarySearchalgo;

import org.w3c.dom.ls.LSOutput;

public class rotatedsortedarray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
//        System.out.println(getPivot(arr));
//        System.out.println(search(arr,0));
        System.out.println(search(arr,2));
    }

    public static boolean search(int[] arr,int target){
        int pivotpoint=getPivot(arr);
        if(pivotpoint==-1){
            int normalsearch=binarysearch(arr,target);
            if(normalsearch ==-1){
                return false;
            }else{return true;}
        }
        int leftsearch=binarysearchfor(arr,target,pivotpoint,true);
        int rightsearch=binarysearchfor(arr,target,pivotpoint,false);

        if(leftsearch == -1 && rightsearch== -1){
            return false;
        }
        return true;
    }

    public static int getPivot(int arr[]){
        int start=0;
        int end =arr.length-1;
        if(arr.length==1){
            return -1;
        }
        while(end>=start) {
            int mid = start+(end-start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }


            if(arr[start] == arr[mid] && arr[end] == arr[mid] && end!=start){
                if(arr[start]>arr[start+1] ){
                    return start;
                } else if (arr[end]<arr[end-1]) {
                    return end-1;
                }
                start=start+1;
                end=end-1;
            } else if (arr[mid] >= arr[start] && arr[mid]!=end) {
                start = mid + 1;
            } else{
                end = mid - 1;
                }

        }
        return -1;
    }

    private static int binarysearchfor(int[] arr,int target,int pivot,boolean left) {
        int start;
        int end;
        if(left){
            start = 0;
            end = pivot;
        }else{
            start = pivot + 1;
            end = arr.length - 1;
        }
        boolean isAsc = arr[start] < arr[end];


        while(end>=start){

            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid; //target found
            }else if(isAsc){
                if(target>arr[mid]){
                    start=mid+1; //right side search space
                }else{
                    end=mid-1;    //left side search space
                }
            }else {
                if(target<arr[mid]){
                    start=mid+1; //right side search space
                }else{
                    end=mid-1;    //left side search space
                }

            }
        }

        return -1;

    }

    private static int binarysearch(int[] arr,int target) {

        int start = 0;
        int end = arr.length-1;
        while(end>=start){

            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;//left side search space
            }else if(target>arr[mid]){
                start=mid+1;   //right side search space
            }else{
                return mid; //target found
            }
        }

        return -1;

    }




}
