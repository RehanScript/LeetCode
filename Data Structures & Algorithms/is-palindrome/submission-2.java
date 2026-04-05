class Solution {
    public boolean isPalindrome(String s) {
        int front = 0, rear = s.length()-1;
        while(front<=rear){
            if(!Character.isLetterOrDigit(s.charAt(front))){front++;continue;}
            if(!Character.isLetterOrDigit(s.charAt(rear))){rear--;continue;}
            if(Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(rear))){
                return false;
            }
            front++;
            rear--;

        }
        return true;
    }
}
