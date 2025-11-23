class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque <Integer> s= new ArrayDeque<>();      
        Queue <Integer> q= new ArrayDeque<Integer>();  
        int n=students.length;
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            s.push(sandwiches[i]);
        }
        int rot =0;
        while(rot<n){

            if(q.peek()==s.peek()){
                q.poll();
                s.pop();
                n--;
                rot=0;
            }
            else{
                int temp=q.poll();
                q.offer(temp);
                rot++;
            }
        }
        return n;
    }
}