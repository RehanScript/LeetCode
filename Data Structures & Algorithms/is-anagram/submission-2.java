class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> table = new HashMap<>();
        int len = s.length();
        int len2 = t.length();
        char ch,ch1;
        int res;
        if(len!=len2){
            return false;
        }
        for(ch = 'a' ; ch <= 'z' ; ch++){
            table.put(ch,0);
        }

        for(int i=0 ; i<len ; i++){
            ch = s.charAt(i);
            ch1 = t.charAt(i);
           
            table.put(ch, table.get(ch) + 1);
            table.put(ch1, table.get(ch1) - 1);
            
        }

        for(int i=0 ; i<len ; i++){
            ch = s.charAt(i);
            res = table.get(ch);
            if(res!=0){
                return false;
            }
            
        }

        return true;

    }
}
