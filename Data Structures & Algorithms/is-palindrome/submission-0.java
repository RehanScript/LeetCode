class Solution {
    public boolean isPalindrome(String s) {
        int flag=1, i, len = s.length();
        if(len==0)return true;
        String str="";
        for(i=0; i<len; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str = str + s.charAt(i);
            }
        }
        str = str.toLowerCase();
        len = str.length();
        for(i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                flag=0;
            }
        }
        if(flag==1)return true;
        return false;
    }
}
