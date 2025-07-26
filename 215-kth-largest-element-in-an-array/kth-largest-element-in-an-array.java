class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k,(x,y)->y-x);
        for(int i:nums) pq.offer(i);
        for(int i=0;i<k-1;i++) System.out.println(pq.poll());
        return pq.poll();
    }
}