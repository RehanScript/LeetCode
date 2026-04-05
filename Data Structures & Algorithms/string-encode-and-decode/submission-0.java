class Solution {

    public String encode(List<String> strs) {
        String temp, encodedStr = "";
        int tempL;
        for(int i = 0; i < strs.size(); i++){
            temp = strs.get(i);
            tempL = temp.length();
            encodedStr = encodedStr + tempL + "#" + temp;
        }
        return encodedStr;
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i,wrdLen;
        String wrd;
        String tempStr = str;
        while(tempStr.length() != 0){
            i = tempStr.indexOf('#');
            wrdLen = Integer.parseInt(tempStr.substring(0,i));
            wrd = tempStr.substring(i+1, i+1+wrdLen);
            decodedStrings.add(wrd);
            tempStr = tempStr.substring(i+1+wrdLen);
        }
        return decodedStrings;
    }
}
