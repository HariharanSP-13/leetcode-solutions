class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int num:nums1){
            hs.add(num);
        }
        for(int num : nums2){
            if(hs.contains(num)){
                l.add(num);
                hs.remove(num);
            }
        }
        int c[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            c[i]=l.get(i);
        }
        return c;
    }
}