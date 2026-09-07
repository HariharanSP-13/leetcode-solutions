
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
  // retry sync
        int sum=0,res=Integer.MAX_VALUE,from=0;
        for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                while(sum>=target){
                    res=Math.min(res,i-from+1);
                    sum-=nums[from++];
                }
            
        }
        return (res==Integer.MAX_VALUE)? 0 : res;
    }
}