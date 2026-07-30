class Solution {
    public boolean checkPerfectNumber(int num) {
        int fact=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                fact+=i;
            }
        }
        if(fact==num){
            return true;
        }
        return false;
    }
}