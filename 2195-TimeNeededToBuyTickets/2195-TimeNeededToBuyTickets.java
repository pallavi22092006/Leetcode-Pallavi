// Last updated: 8/11/2026, 2:48:55 PM
class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<t.length;i++)
        q.add(i);
        int a=0;
        while(!q.isEmpty()){
            int index=q.poll();  //   comes out of the queue
            a++;   // he needs one seconds to buy the tickets
            t[index]--;  // decrement needed ticket
            if(t[index]>0)
                q.add(index);
            if(index==k && t[index]==0)
                return a;
        }
        return a;
    }
}