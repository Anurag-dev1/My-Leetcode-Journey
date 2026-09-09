class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;

        Map <Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        for(int i : map.values()){
            if(i % 2 == 1)
            return false;
        }

        return true;
    }
}