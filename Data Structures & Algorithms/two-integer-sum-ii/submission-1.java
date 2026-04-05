class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int finalPos[] = new int[2];
        int front=0,rear=numbers.length-1,sum;
        
        while(front<rear){
            sum = numbers[front] + numbers[rear];
            if(sum == target){finalPos[0] = front+1; finalPos[1] = rear+1;break;}
            else if(sum<target){front++;continue;}
            else{rear--;}
        }
        return finalPos;
    }
}
