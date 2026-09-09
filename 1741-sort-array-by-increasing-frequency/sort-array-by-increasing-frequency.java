class Solution {
    public int[] frequencySort(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();
        int n =nums.length;
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }

        Integer[] arr = new Integer[n];

        for(int i = 0 ;i< n ; i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr,(a,b) -> {
            if(map.get(a).equals(map.get(b))) {
                return Integer.compare(b,a);
            }

            return Integer.compare(map.get(a) , map.get(b));
        });

        for(int i = 0 ;i< n ;i++){
            nums[i] = arr[i];
        }

        return nums;
    }
}