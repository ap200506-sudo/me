class Solution {

    boolean match(char a, char b){
        if((a=='[' && b==']') || (a=='{' && b=='}') || (a=='(' && b==')')){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        ArrayDeque <Character> st= new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='[' || x=='{' || x=='('){
                st.push(x);
            }
            else{
                if(st.isEmpty() == true){
                    return false;
                }
                if(match(st.peek(),x) == true){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        if(st.isEmpty()==true ){
                return true;
            }
        return false;
        
    }
}