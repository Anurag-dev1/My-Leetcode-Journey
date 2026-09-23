class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> nums(n);
        for(int i = 0; i< n ;i++){
            if((i+1) % 15 == 0)
            nums[i] = "FizzBuzz";
            else if((i+1) % 5 == 0)
            nums[i] = "Buzz";
            else if((i+1) % 3 == 0)
            nums[i] = "Fizz";
            else 
            nums[i] = to_string(i+1);
        }
        return nums;
    }
};