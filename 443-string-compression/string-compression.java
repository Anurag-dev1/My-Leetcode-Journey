class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        char curr = chars[0];
        int count = 1;

        for(int i = 1; i < n; i++) {

            if(curr == chars[i]) {
                count++;
            } 
            else {
                chars[idx++] = curr;

                if(count > 1) {
                    String str = String.valueOf(count);

                    for(char ch : str.toCharArray()) {
                        chars[idx++] = ch;
                    }
                }

                curr = chars[i];
                count = 1;
            }
        }
        
        chars[idx++] = curr;

        if(count > 1) {
            String str = String.valueOf(count);

            for(char ch : str.toCharArray()) {
                chars[idx++] = ch;
            }
        }

        return idx;
    }
}