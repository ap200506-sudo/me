import java.util.Hashtable;
class Solution {
    public int residuePrefixes(String s) {
        HashSet <Character> h = new HashSet<Character>();
        int res=0;
        for(int i=1 ; i<=s.length();i++){
            String ss = s.substring(0,i);
            
            int length=ss.length();
            for(int j=0;j<length;j++){
                h.add(ss.charAt(j));
            }
            int x= length %3;
            if(h.size() == x ){
                res++;
            }
            h.clear();
            
        }
        return res;
        
    }
}