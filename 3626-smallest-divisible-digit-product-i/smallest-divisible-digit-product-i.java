class Solution {
    public int smallestNumber(int n, int t) {
        while(!check(n,t)){
            n++;
        }
        return n;
    }

    static boolean check(int num,int t){
        int product = 1;
        while( num > 0 ){
            product*=num%10;
            num= num/10;

            if(product==0){
                break;
            }
        }
        return product % t == 0;
    }
}