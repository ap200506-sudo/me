class Solution {
    public boolean isBalanced(String num) {
        int sumeven=0;
        int sumodd=0;
        int count=0;
        
        
        for(int i=0;i<num.length();i++){
            
            int digit = num.charAt(i) - '0';
            count++;
            if(count%2==0){
                sumeven+=digit;
            }
            if(count%2!=0){
                sumodd+=digit;
            }
            
        }
        if(sumeven==sumodd){
            return true;
        }
        else{
            return false;
        }
        
    }
}