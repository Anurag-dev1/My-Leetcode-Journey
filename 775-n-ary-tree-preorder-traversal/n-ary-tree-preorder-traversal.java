class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();

        if(root == null)
        return res;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node top = st.pop();

            res.add(top.val);

            for(int i = top.children.size()-1;i>=0;i--){
                st.push(top.children.get(i));
            }
        }
        return res;
    }
}