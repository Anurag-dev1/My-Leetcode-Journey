class Solution {

    int[] getNSL(int [] arr , int n){
        int res[] = new int[n];
        Stack <Integer> st = new Stack<>();

        for(int i =0 ; i< n ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i])
            st.pop();

            res[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }
        return res;
    }

    int[] getNSR(int [] arr , int n){
        int res[] = new int[n];
        Stack <Integer> st = new Stack<>();

        for(int i = n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            st.pop();

            res[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }
        return res;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int M = 1000000007;

        int []NSL = getNSL(arr, n);
        int []NSR = getNSR(arr, n);

        long sum =0;

        for(int i = 0 ; i< n ; i++){
            int left = i - NSL[i];
            int right = NSR[i] - i;

            long totalWays = left * right;
            long totalSum = (long)arr[i] * totalWays;

            sum = (sum + totalSum) % M;
        }
        return (int)sum;
    }
}