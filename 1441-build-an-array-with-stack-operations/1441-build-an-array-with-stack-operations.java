class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack <Integer> s  = new Stack <Integer>();
        ArrayList <String> al = new ArrayList <String>();
        int l =target.length;
        int j=0;
        for(int i=1;i<=n;i++){
            if(j<l){
                if(target[j]==i){
                    al.add("Push");
                    j++;
                }
                else{
                    al.add("Push");
                    al.add("Pop");
                }
            }
            else{
                break;
            }

        }
        return al;
        
    }
}