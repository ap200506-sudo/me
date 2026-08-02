class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character, Character> h = new HashMap<>();
        

        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                char temp = h.get(s.charAt(i));
                if(temp != t.charAt(i)){
                    return false;
                }
                
            }
            if(!h.containsKey(s.charAt(i)) && h.containsValue(t.charAt(i))){
                return false;
            }
            h.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
       
        
    
}