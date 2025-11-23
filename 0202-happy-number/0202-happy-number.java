class Solution {
    public boolean isHappy(int n) {

        HashSet <Integer> h = new HashSet<Integer>();
        boolean changed = true;

        while(!h.contains(n)){
            h.add(n);
            int ans=0;
            
            while(n!=0){
                int lastdig=n%10;
                ans+= lastdig*lastdig;
                n=n/10;
                
            }
            
            
            if(ans==1){
                return true;
            }
            n=ans;
        }
        return false;
    }
}