class Solution {
    public int reverse(int x) {
        int temp=x;
        int mul=0;
        if(x>0){
            while(temp!=0){
                
                int ld=temp%10;
                if(mul>Integer.MAX_VALUE/10){
                    return 0;
                }
                if(mul<Integer.MIN_VALUE/10){
                    return 0;
                }

                mul=mul*10+ld;

                temp=temp/10;
            }
        }
        int ans=mul;
        
        if(x<0){
                mul=0;

                temp=x*(-1);
                while(temp!=0){
                    
                    int ld=temp%10;
                    if(mul>Integer.MAX_VALUE/10){
                        return 0;
                    }
                    if(mul<Integer.MIN_VALUE/10){
                    return 0;
                }

                    mul=mul*10+ld;

                    temp=temp/10;
                }

                ans=mul*(-1);
        }
        
        return ans;
        
        
    }
}