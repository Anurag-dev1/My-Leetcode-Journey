class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int res= 0;

        if(n < 3)
        return 0;

        Map < Integer, ArrayList<Integer>> mp = new HashMap<>();

        for(int i = 0 ; i < n ;i++){
            if(!mp.containsKey(nums[i]))
                mp.put(nums[i] , new ArrayList<>());

            mp.get(nums[i]).add(i);
        }

        for(int i : mp.keySet()){
            ArrayList<Integer> arr = mp.get(i);

            if(arr.size() != 3)
            continue;

            int pos_diff = arr.get(1) - arr.get(0);

            boolean gap = true;

            for(int j = 2 ; j < arr.size() ; j++){
                if((arr.get(j) - arr.get(j-1)) != pos_diff){
                    gap = false;
                    break;
                }
            }

            if(gap == true)
            res++;
        }
        return res;
    }
}