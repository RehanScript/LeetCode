class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> allChar = new HashMap<>();
        int l=0,r=0,res=0;
        while(r < s.length()){
            char ch = s.charAt(r);
            if(!allChar.containsKey(ch)){
                allChar.put(ch,r);
                r++;
            }
            else{
                if(allChar.get(ch) >= l){
                    l = allChar.get(ch) + 1;
                    
                    
                }
                allChar.put(ch,r);
                r++;
            }
            res = (r-l)>res ? (r-l) : res;
        }
        return res;
    }
}
