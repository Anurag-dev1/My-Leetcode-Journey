class Solution {
    public int longestPalindrome(String s) {
        int []freq1 = new int [26];
        int []freq2 = new int [26];

        Arrays.fill(freq1 , 0);
        Arrays.fill(freq2 , 0);

        int n = s.length();

        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch))
            freq1[ch - 'a']++;
            if(Character.isUpperCase(ch))
            freq2[ch - 'A']++;
        }
        int res = 0;
        for(int i = 0 ;i < 26 ; i++){
            res+=(freq1[i]/2)*2;
            res+=(freq2[i]/2)*2;
        }

        if(res == n)
        return res;

        return res+1;
    }
}