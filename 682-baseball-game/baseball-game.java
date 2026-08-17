class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();

        for(String op : operations){
            switch(op){
                case "+":
                    int last =st.pop();
                    int seclast = st.peek();
                    st.push(last);
                    st.push(last+seclast);
                    break;
                case "D":
                    st.push(2*st.peek());
                    break;
                case "C":
                    st.pop();
                    break;
                default:
                    st.push(Integer.parseInt(op));
                    break;
            }
        }

        int sum=0;
        for(int sc:st){
            sum+=sc;
        }   

        return sum;
    }
}