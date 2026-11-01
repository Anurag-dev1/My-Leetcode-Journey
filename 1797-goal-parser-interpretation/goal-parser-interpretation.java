class Solution {
    public String interpret(String command) {
        int n = command.length();
        String str = "";

        for(int i = 0 ; i < n ; i++){
            char ch = command.charAt(i);

            if(ch == '(' && command.charAt(i+1)== ')')
            str = str + 'o';
            
            if((ch >= 'A' && ch <= 'Z') ||(ch >= 'a' && ch <= 'z')){
                str = str + ch;
            }
        }
        return str;
    }
}