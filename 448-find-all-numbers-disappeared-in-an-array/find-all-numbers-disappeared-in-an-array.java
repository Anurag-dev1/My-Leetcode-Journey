class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        boolean []mark = new boolean[n+1];
        mark[0] = true;

        for(int i : nums){
            mark[i] = true;
        }

        List <Integer> res =new ArrayList<>();

        for(int i = 0 ; i <=n ; i++){
            if(!mark[i])
            res.add(i);
        }

        return res;
    }
}