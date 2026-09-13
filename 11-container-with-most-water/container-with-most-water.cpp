class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int left = 0;
        int right = n-1;

        int maxA = 0;

        while(left < right){
            int curr_A = min(height[left] , height[right]) * (right - left);

            maxA = max(curr_A,maxA);

            if(height[left] < height[right])
            left++;
            else
            right--;
        }
        return maxA;
    }
};