class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Map <Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            mp.put(arr[i] , mp.getOrDefault(arr[i],0) + 1);
        }

        Set <Integer> freq = new HashSet<>();

        for(int i : mp.values()){
            if(!freq.add(i)){
                return false;
            }
        }
        return true;
    }
}