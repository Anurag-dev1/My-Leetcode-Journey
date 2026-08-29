class Solution {

    private void dfs(Node root , List<Integer> res){
        for(Node child : root.children){
            dfs(child,res);
        }
        res.add(root.val);
    }

    public List<Integer> postorder(Node root) {
        List <Integer> res =new ArrayList<>();

        if(root == null)
        return res;
        
        dfs(root , res);
        
        return res;
    }
}