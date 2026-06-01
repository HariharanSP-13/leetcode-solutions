class Solution {
    public int search(int[] nums, int target) {
        //test
        int index=0,flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
                flag=1;
            }
        }
        if(flag==1)
            return index;
        else 
        return -1;
    }
}