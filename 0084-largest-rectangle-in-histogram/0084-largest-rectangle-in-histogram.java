class Solution {
    public int [] previoussmaller(int [] arr){
        Stack <Integer> s = new Stack<>();
        int [] ans= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            int ps = s.isEmpty() ? -1 : s.peek();
            ans[i]=ps;
            s.push(i);
        }
        return ans;
    }
    public int [] nextsmaller(int [] arr){
        Stack <Integer> s = new Stack<>();
        int [] ans= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            int ns = s.isEmpty() ? arr.length : s.peek();
            ans[i]=ns;
            s.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int [] prev= previoussmaller(heights);
        int [] next = nextsmaller(heights);
        int res=0;
        for(int i=0;i<heights.length;i++){
            int curr=0;
            
            curr+=(next[i]-prev[i]-1)*heights[i];
            res=Math.max(res,curr);
        }
        return res;
        
    }
}