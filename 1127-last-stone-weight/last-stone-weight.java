class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> res = new ArrayList<>();

        for(int i : stones){
            res.add(i);
        }

        while(res.size() > 1){
            Collections.sort(res);

            int a = res.remove(res.size() - 1);
            int b = res.remove(res.size() - 1);

            res.add(Math.abs(a-b));
        }

        return res.get(0);
    }
}