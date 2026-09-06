class Solution {
public:
    int t[31];
    int Solve(int n){
        if(n==0)
        return 0;
        
        if(n==1)
        return 1;

        if(t[n] != -1)
        return t[n];

        int a = Solve(n-1) + Solve(n-2);

        return t[n] = a;

    }

    int fib(int n) {
        memset(t,-1,sizeof(t));

        return Solve(n);
    }
};