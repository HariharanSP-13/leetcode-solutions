class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        else if(nums.length == 1)
            return nums[0];
        else if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int[] nums1 = nums.clone();
        int max1 = 0;
        nums1[1] = Math.max(nums1[0],nums1[1]);
        for(int i = 2; i<nums1.length-1;i++){
            nums1[i] = Math.max(nums1[i]+nums1[i-2],nums1[i-1]);
        }
        max1 = nums1[nums1.length-2];
        int max2 = 0;
        nums[2] = Math.max(nums[1],nums[2]);
        for(int i = 3; i<nums.length;i++){
            nums[i] = Math.max(nums[i]+nums[i-2],nums[i-1]);
        }
        max2 = nums[nums.length-1];
        return Math.max(max1,max2);
    }
}