
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        Map<Character, Integer> mp = new HashMap<>();

        int right = 0;
        int left = 0;
        int maxFreq = 0;
        int res = 0;

        while(right < n) {

            char ch = s.charAt(right);

            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, mp.get(ch));

            while((right - left + 1) - maxFreq > k) {

                char lefty = s.charAt(left);

                mp.put(lefty, mp.get(lefty) - 1);

                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }

        return res;
    }
}
