class Solution {
    public int maxSum(int[] nums) {
        Set <Integer> set =new HashSet<>();

        int maxNeg = Integer.MIN_VALUE;

        int sum=0;

        for(int n : nums){
            if(n<=0){
                maxNeg = Math.max(maxNeg , n);
            }else if(!set.contains(n)){
                sum+=n;
                set.add(n);
            }
        }

        sum = (sum == 0)?maxNeg:sum;

        return sum;
    }
}