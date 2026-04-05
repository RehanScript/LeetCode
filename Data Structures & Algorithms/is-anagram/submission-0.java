class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char ch1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(ch1 = 'a'; ch1 <= 'z' ; ch1++){
            map.put(ch1,0);
        }
        for(int i = 0; i<s.length() ; i++ ){
            char ch = s.charAt(i);
            map.put(ch, map.get(ch) + 1);
            ch = t.charAt(i);
            map.put(ch, map.get(ch) - 1);
        }
        for(ch1 = 'a'; ch1 <= 'z' ; ch1++){
            if(map.get(ch1) !=0){
                return false;
            }
        }
        return true;

    }
}
