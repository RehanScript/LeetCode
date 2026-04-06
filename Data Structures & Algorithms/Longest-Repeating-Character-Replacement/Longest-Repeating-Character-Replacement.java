class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> countFreq = new HashMap<>();
        int maxFreq = 0,l=0, result = 0;
        for(int i = 0; i<s.length(); i++) {
            countFreq.put(s.charAt(i), countFreq.getOrDefault(s.charAt(i), 0) + 1);
            maxFreq = Math.max(maxFreq, countFreq.get(s.charAt(i)));

            while((i-l+1)-maxFreq > k){
                countFreq.put(s.charAt(l), countFreq.get(s.charAt(l)) - 1 );
                l++;
            }
            result = Math.max(result, i-l+1);
        }
        return result;
    }
}
