class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder res = new StringBuilder();

        int n = num.length();

        for(int i = 0 ; i < n ;i++){
            char curr = num.charAt(i);

            while(res.length() > 0 && res.charAt(res.length() - 1) > curr && k > 0){
                res.deleteCharAt(res.length() - 1);
                k--;
            }
            if(res.length() > 0 || curr != '0')
            res.append(curr);

        }
        while(k > 0 && res.length() > 0){
            res.deleteCharAt(res.length() - 1);
            k--;
        }

        if(res.length() == 0)
        return "0";

        return res.toString();
    }
}