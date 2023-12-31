class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
      for(int i=s.length()-1;i>=0;i--){
          if(s.charAt(i) != ' '){
              count++;
          }
          else if (s.charAt(i) == ' '){
              break;
          }
          if (s.charAt(s.length()-1) == ' '){
              ++count;
              continue;
          }
      }  
      return count ;
    }
}
