class Solution {
    public boolean isAnagram(String s, String t) {

        if(t.length() != s.length()){
            return false;
        }

        HashMap <Character, Integer> h = new HashMap <>();
        for(int i=0;i<s.length();i++){
            int x=0;
            if(h.containsKey(s.charAt(i))){
                x=h.get(s.charAt(i));
            }
            h.put(s.charAt(i), x+1);
        }

        for(int i=0;i<t.length();i++){
            if(!(h.containsKey(t.charAt(i)))){
                return false;
            }
            int x=h.get(t.charAt(i));
            if(x<1){
                return false;
                
            }
            h.put(t.charAt(i), x-1);
        }
        return true;
        
    }
}