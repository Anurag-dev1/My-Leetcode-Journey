class Solution {
    int N;
    String result = "";
    Set <Integer> st = new HashSet<>();
    int level = 0;
    boolean found = false;
    private void BackTrack(List <Integer> temp , int nums[],int k){

        if(found == true)
        return ;
        
        if(temp.size() == N){
            level++;
            if(level == k){
                for(int i :temp){
                    result += i;
                }
                found =true;
                return;
            }
            return;
        }

        for(int i = 0;i < N ;i++){
            if(!st.contains(nums[i])){
                temp.add(nums[i]);
                st.add(nums[i]);

                BackTrack(temp, nums,k);

                temp.remove(temp.size()-1);
                st.remove(nums[i]);
            }
        }
    }

    public String getPermutation(int n, int k) {

        int[] nums = new int[n];
        for(int i = 1 ; i<=n ; i++)
            nums[i-1] = i; 
        N = n;

        List<Integer> temp = new ArrayList<>();

        BackTrack(temp, nums,k);

        return result;
    }
}