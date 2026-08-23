class Solution {
public:
    bool sumGame(string num) {
        int n = num.length();

        int leftSum = 0;
        int rightSum = 0;

        int leftQn = 0;
        int rightQn = 0;

        for(int i = 0 ; i< n ;i++){
            if(num[i] == '?'){
                if(i < n/2){
                    leftQn++;
                }else{
                    rightQn++;
                }
            }else{
                if(i < n/2){
                    leftSum+=num[i] - '0';
                }else{
                    rightSum+=num[i] - '0';
                }
            }
        }

        int totalQn = leftQn + rightQn;

        if(totalQn % 2 == 1){
            return true;
        }
        
        int left = 2*leftSum + 9*leftQn;
        int right = 2*rightSum + 9*rightQn;

        if(right == left)
        return false;
        else
        return true;
    }
};