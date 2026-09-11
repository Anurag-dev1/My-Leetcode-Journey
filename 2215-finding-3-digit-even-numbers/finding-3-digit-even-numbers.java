class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set <Integer> st = new HashSet<>();

        int n = digits.length;

        for(int i =0 ; i < n ; i++){
            if(digits[i]==0)continue;

            for(int j = 0 ; j < n ;j++){
                if(i == j)continue;

                for(int  k =0 ; k < n ;k++){
                    if(i == k || j == k || digits[k] % 2 == 1)
                    continue;

                    int num = 100*digits[i] + 10*digits[j] + digits[k];

                    st.add(num);
                }
            }
        }
        Set<Integer> sSet = new TreeSet<>(st);

        return sSet.stream().mapToInt(Integer::intValue).toArray();
    }
}