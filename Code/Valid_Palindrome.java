class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length-1;
        while (left<right){
            char leftchar=s.charAt(left);
            char rightchar=s.charAt(right);

            if(!Character.isLetterOrDigit(leftchar))
            {
                left++;
                continue;
            }
            if(Character.isLetterOrDigit(rightchar)){
                right--;
                continue;
            }
            if(Character.isLetterOrDigit(leftchar)!=Character.isLetterOrDigit(rightchar)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
}
