class Solution {
    public int distinctIntegers(int n) {
        HashSet <Integer> h = new HashSet<Integer>();
        
        int n1=n;
        h.add(n);
        
        boolean changed=true;
        while(changed){
            changed=false;
            HashSet<Integer> nn = new HashSet<>();
            for(int x : h){
                for(int i=1;i<n;i++){
                    if(x%i==1 && !h.contains(i)){
                        nn.add(i);
                        changed = true;
                    }
                }
            }
            h.addAll(nn);
        }
        
        return h.size();
        
    }
}