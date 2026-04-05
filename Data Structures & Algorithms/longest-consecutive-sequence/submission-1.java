class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){return 0;}
        int i,length,longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                length = 1;
                while(set.contains(num+length)){
                    length++;
                }
                if(length>longest){
                    longest = length;
                }
            }
        }
        return longest;
    }
}
