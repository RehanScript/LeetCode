class Solution {
    public int maxArea(int[] heights) {
        int front=0,rear=heights.length - 1, maxVol = 0, vol;
        while(front<rear){
            vol = (rear-front) * ((heights[front] > heights[rear] ? heights[rear] : heights[front]));
            if(maxVol < vol){
                maxVol = vol;
            }
            if(heights[front] > heights[rear]){
                rear--;
            }
            else{
                front++;
            }
        }
        return maxVol;
    }
}
