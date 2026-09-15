// Last updated: 9/15/2026, 4:17:20 PM
class Solution {
    public int countStudents(int[] st, int[] sa) {
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        // store sandwiches in stack ( 0th should be in top)
        for(int i=sa.length-1;i>=0;i--)
            s.push(sa[i]);
        for(int j:st)
            q.add(j);
        int t=0;
        while(!q.isEmpty() && !s.isEmpty() && t<s.size()){
            if(q.peek() == s.peek()){
                s.pop();
                q.poll();
                t=0;
            }
            else{
                t++;
                q.add(q.poll());
            }
        }    
        return q.size();
    }
}