class Solution {
    public int trap(int[] height) {
        if(height.length < 2){return 0;}
        int l=0,r=height.length-1, lmax = height[0], rmax = height[height.length-1];
        int block = 0, maxWater = 0;
        while (l < r) {
    if (lmax < rmax) {
        l++; 
        lmax = Math.max(lmax, height[l]); 

        maxWater += lmax - height[l]; 
    } else {
        r--; 
        rmax = Math.max(rmax, height[r]);
        
        maxWater += rmax - height[r];
    }
}
        return maxWater;
    }
}
