class Solution {
    static int [][]dp = new int[1001][1001];
    private static long Solve(String s,String t , int m , int n){
        if(n==0)
        return 1;

        if(m==0)
        return 0;

        if(dp[m][n] != -1)
        return dp[m][n];

        if(s.charAt(m-1) == t.charAt(n-1))
        return dp[m][n] =(int) Solve(s, t, m-1 , n-1) +(int) Solve(s , t, m-1 , n);
        else
        return dp[m][n] =(int) Solve(s , t , m-1 , n);

    }

    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
       for(int i = 0; i <= 1000; i++)
            Arrays.fill(dp[i], -1);
        return (int) Solve(s , t, m , n);   
    }
}