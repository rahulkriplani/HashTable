class Solution {
    public String dfs(TreeNode root, Map<String, Integer> freq, List<TreeNode> ans){
        if(root==null)
            return "#";
        
        String subtree = root.val + "," + dfs(root.left, freq, ans) + "," + dfs(root.right, freq, ans);
        int f = freq.getOrDefault(subtree, 0);
        freq.put(subtree, ++f);
        
        if (f == 2)
            ans.add(root);
        
        return subtree;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        dfs(root, new HashMap<>(), ans);
        return ans;
    }
}
