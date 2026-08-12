class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->{return b.compareTo(a);});
        for(int i:nums){
            q.offer(i);
        }
        for(int i = 1;i<k;i++){
            q.poll();
        }
        return q.peek();
    }
}