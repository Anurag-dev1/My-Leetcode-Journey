class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        int n = heights.length;
        Arrays.sort(heights);
        int count = 0;
        for(int i=0 ;i < n ;i++){
            if(heights[i] != arr[i])
            count++;
        }

        return count;
    }
}