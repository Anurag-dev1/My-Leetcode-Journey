class Solution {
    public int minimumSwap(String s1, String s2) {
        if(s1.length() != s2.length()){
            return -1;
        }

        int xy = 0;
        int yx = 0;

        for(int i =0;i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                
                if(s1.charAt(i) == 'x'){
                    xy++;
                }else{
                    yx++;
                }
            }
        }

        int res ;

        if(xy%2 != yx%2){
            res = -1;
        }else{
            res = xy/2 + yx/2 + xy%2 + yx%2;
        }
        return res;
    }
}