 public boolean isValidBST(TreeNode root) {
       if(root == null){
           return true;
       }
        return validhelper(root,null,null);
      
    }
    public boolean validhelper(TreeNode root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        return (min == null || root.val > min)&&(max == null || root.val < max)&&validhelper(root.left,min,root.val)&&validhelper(root.right,root.val,max);
    }
   