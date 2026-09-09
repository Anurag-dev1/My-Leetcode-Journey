class Solution {
    public int maxNumberOfBalloons(String text) {
        String s = "balloon";
        int [] freqB = new int [26];

        for(char ch: s.toCharArray()){
            freqB[ch-'a']++;
        }

        int [] freq = new int[26];

        for(char ch : text.toCharArray()){
            freq[ch-'a']++;
        }
        int result = Integer.MAX_VALUE;
        for(int i =0 ; i< 26 ; i++){
            if(freqB[i]>0){
                result = Math.min(result , freq[i] / freqB[i]);
            }
        }

        return result;
    }
}