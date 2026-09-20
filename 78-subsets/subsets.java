class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void Solve(int [] nums, int n , int i , List<Integer> temp ){
        if( i>= n){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        Solve(nums , n , i+1 , temp);
        temp.remove(temp.size() - 1);
        Solve(nums , n , i+1 , temp);
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List <Integer> temp = new ArrayList<>();
        Solve(nums, n , 0 , temp);

        return res;
    }
}