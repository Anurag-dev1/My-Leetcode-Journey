class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String w : logs){
            if(w.equals("../")){
                if(count> 0)
                count--;
            }else if(w.equals("./")){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}