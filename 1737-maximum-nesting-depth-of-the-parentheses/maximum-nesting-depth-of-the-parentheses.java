class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        Stack <Character> st = new Stack<>();
        int i = 0;
        int maxi = 0;
        int curr =0;

        while(i < n){
            if(s.charAt(i) == '(')
            curr++;
            else if(s.charAt(i) == ')')
            curr--;
            i++;
            maxi = Math.max(curr, maxi);
        }

        return maxi;
    }
}