class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int d=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    d++;
                }
            }
            if(d==1){
                c=nums[i];
            }
        }
        return c;

    }
}