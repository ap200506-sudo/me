class Solution {
    public boolean isHappy(int n) {

        HashSet <Integer> h = new HashSet <Integer>();
        boolean changed=true;
        
        
       
        while(!h.contains(n)){
            h.add(n);
            int sum=0;
            while(n!=0){
                int ld=n%10;
                sum+=ld*ld;
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            n=sum;
            
        }
        return false;
    }
}