// Last updated: 8/13/2026, 11:33:07 AM
/*lass Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
               pq.add(ele);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();
    }
}*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:nums){
            if(pq.size()<k){
                pq.add(ele);
            }
            else if(ele> pq.peek()){
                pq.poll();
                pq.add(ele);
            }
        }
        return pq.peek();
    }
}