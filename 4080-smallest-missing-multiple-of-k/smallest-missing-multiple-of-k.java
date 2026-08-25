class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int mul=k;
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mul){
                j++;
                mul=k*j;
            }
        }
        return mul;
    }
}