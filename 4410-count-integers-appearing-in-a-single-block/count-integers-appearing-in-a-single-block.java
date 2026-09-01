class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length == 0)
        return 0;

        if(nums.length == 1)
        return 1;

        Map <Integer,Integer> block = new HashMap<>();

        block.put(nums[0] , block.getOrDefault(nums[0],0) + 1);

        for(int i =1 ; i< nums.length; i++){
            if(!(nums[i] == nums[i-1]))
            block.put(nums[i] , block.getOrDefault(nums[i],0) + 1);
        }

        int result = 0;

        for(Map.Entry<Integer,Integer> it : block.entrySet()){
            if(it.getValue() == 1)
            result++;
        }

        return result;
    }
}