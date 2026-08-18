class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        for(int k : mp.keySet()){
            if(mp.get(k)==k){
                res = k;
            }
        }
        return res;
    }
}