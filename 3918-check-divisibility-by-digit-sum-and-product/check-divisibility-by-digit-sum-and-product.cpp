class Solution {
public:
    bool checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int copy = n;
        while(n>0){
            int d = n%10;
            sum +=d;
            product*=d;
            n/=10;
        }
        if(copy % (sum+product) ==0)
        return true;
        else 
        return false;
    }
};