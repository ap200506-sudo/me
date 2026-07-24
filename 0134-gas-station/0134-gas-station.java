class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int sumgas=0;
        int sumcost=0;
        for(int i=0;i<n;i++){
            sumgas+=gas[i];
            sumcost+=cost[i];
        }
        if(sumcost>sumgas){
            return -1;
        }
        int sidx=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=gas[i]-cost[i];

            if(sum<0){
                sum=0;
                sidx=i+1;
            }
        }
        return sidx;
        
    }
}