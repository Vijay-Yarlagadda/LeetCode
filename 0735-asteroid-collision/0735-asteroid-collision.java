class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int asteroid : asteroids){
            boolean isDestroyed=false;
            while(!st.isEmpty() && st.peek()>0 && asteroid<0){
                if(st.peek()<Math.abs(asteroid)){
                    st.pop();
                    continue;
                }else if(st.peek()==Math.abs(asteroid)){
                    st.pop();
                }
                isDestroyed=true;
                break;
            }
            if(!isDestroyed){
                st.push(asteroid);
            }
        }

            int[] res=new int[st.size()];
            for(int i=res.length-1;i>=0;i--){
                res[i]=st.pop();
            }
        return res;
    }
}