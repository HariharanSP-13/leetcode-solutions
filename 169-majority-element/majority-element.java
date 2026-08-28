class Solution {
    public int majorityElement(int[] nums) {
        int count=0,val=0;
        for(int num:nums){
            if(count==0){
                val=num;
            }
            count+=(num==val)? 1 : -1;
        }
        return val;
        
    }
}