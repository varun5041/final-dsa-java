package BitManipulation.BasicsAndLeetcode;

public class NthmagicNo {
    public int nthMagicNo(int n) {
        // code here
        int ans = 0;
        for(int i =0 ; i<=31 ;i++){
            if(checknthBit(n,i)){
                ans+=1*Math.pow(5,i+1);
            }
        }
        return ans;
    }

    public boolean checknthBit(int num,int n){
        if((num &(1<<n))==0){
            return false;
        }


        return true;
    }
}
