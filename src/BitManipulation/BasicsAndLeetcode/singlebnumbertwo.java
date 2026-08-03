package BitManipulation.BasicsAndLeetcode;

public class singlebnumbertwo {
    static void main(String[] args) {
        int arr[]={-1,2,2,2};

        System.out.println(singlenumberthrice(arr));
    }

    private static int singlenumberthrice(int[] nums) {
        int n = nums.length;
        int counter = 0;
        int ans = 0;
        for(int pos = 0;pos<32;pos++){
            counter = 0;
            for(int i = 0; i<n;i++){
                counter+=((nums[i]>>pos)&1);
            }
            if((counter % 3)!=0){
                ans+=(counter%3)*(1<<pos);
            }
        }

        return ans;

    }
}
