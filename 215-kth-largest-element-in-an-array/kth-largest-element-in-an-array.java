class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        k = n-k;

        return quickSelect(nums,0,n-1,k);
    }

    private int quickSelect(int nums[],int l,int r,int k){
        int pivot = nums[r];
        int p = l;

        for(int i=l;i<r;i++){
            if(nums[i]<pivot){
                int temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                p++;
            }
        }
        int temp = nums[p];
        nums[p] = nums[r];
        nums[r] = temp;

        if(p>k){
            return quickSelect(nums,l,p-1,k);
        }else if(p<k){
            return quickSelect(nums,p+1,r,k);
        }else{
            return nums[p];
        }
    }
}