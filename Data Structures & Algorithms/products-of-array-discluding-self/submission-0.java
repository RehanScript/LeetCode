class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,r=1;
        int lp[] = new int[nums.length];
        int rp[] = new int[nums.length];
        int products[] = new int[nums.length];
        for(i=0; i<nums.length; i++){
            if(i==0){
                lp[0] = 1;
                continue;
            }
            lp[i] = nums[i-1] * lp[i-1];
        }
        for(i = nums.length - 1; i>=0; i--){
            if(i == nums.length - 1){
                rp[i] = 1;
                continue;
            }
            rp[i] = rp[i+1] * nums[i+1];

        }
        for(i = 0; i< nums.length; i++){
            products[i] = lp[i] * rp[i];
        }
        return products;
    }
}  
