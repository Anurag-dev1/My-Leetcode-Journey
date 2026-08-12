class Solution {
    public int maxProductDifference(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secsmallest = Integer.MAX_VALUE;

        for(int n :nums){
            if(n>largest){
                seclargest=largest;
                largest = n;
            }else
            seclargest = Math.max(n,seclargest);

            if(n<smallest){
                secsmallest=smallest;
                smallest=n;
            }else
            secsmallest = Math.min(n,secsmallest);
        }
        return (largest*seclargest - smallest*secsmallest);
    }
}