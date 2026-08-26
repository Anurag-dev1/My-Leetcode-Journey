class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        int temp ;

        for(int k = 0 ; k < 32 ; k++){
            temp = (1<<k);

            int countOnes = 0;

            for(int i : nums){
                if((i & temp) != 0){
                    countOnes++;
                }
            }
            if(countOnes % 3 == 1){
                result = result | temp;
            }
        }
        return result;
    }
}