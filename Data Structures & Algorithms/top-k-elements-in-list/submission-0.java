class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:nums)
        {
            m.put(x,m.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));

        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            pq.offer(entry);
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}
