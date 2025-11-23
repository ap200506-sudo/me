class Solution {
    public int myAtoi(String s) {
        int sign=1;
        long num=0;
        boolean started=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && !started){
                continue;
            }
            if(s.charAt(i)=='-'&& !started){
                sign=-1;
                started=true;
                continue;
            }
            if(s.charAt(i)=='+'&& !started){
                sign=1;
                started=true;
                continue;
            }
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                started=true;
                int temp= (int)s.charAt(i) - (int)'0';
                num=num*10 + temp;
                if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            }
            

            else{
                break;
            }
        }
        num=num*sign;
        
        return (int)num;
        
    }
}