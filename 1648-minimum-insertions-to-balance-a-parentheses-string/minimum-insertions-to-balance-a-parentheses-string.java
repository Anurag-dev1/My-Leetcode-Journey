class Solution {
    public int minInsertions(String s) {
        int p = 0;
        int res = 0;
        int n = s.length();

        for(int i = 0 ; i< n ; i++){
            if(s.charAt(i) == '(')
            p++;
            else{
                if(i+1 < n && s.charAt(i+1) == ')')
                i++;
                else
                res++;

                if(p > 0)
                p--;
                else
                res++;
            }
        }
        return res + p * 2;
    }
}