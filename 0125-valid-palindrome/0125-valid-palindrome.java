class Solution {

    
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        int start=0;
        int e= s.length() - 1;
        while(start<=e){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                
            }
            else if(!Character.isLetterOrDigit(s.charAt(e))){
                e--;
            }

            else{
                if(s.charAt(start)!=s.charAt(e)){
                    return false;
                }
                start++;
                e--;
            }   
        }
        return true;
    }
}