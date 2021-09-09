//给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。 
//
// 有效 二叉搜索树定义如下： 
//
// 
// 节点的左子树只包含 小于 当前节点的数。 
// 节点的右子树只包含 大于 当前节点的数。 
// 所有左子树和右子树自身必须也是二叉搜索树。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [2,1,3]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：root = [5,1,4,null,null,3,6]
//输出：false
//解释：根节点的值是 5 ，但是右子节点的值是 4 。
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目范围在[1, 104] 内 
// -231 <= Node.val <= 231 - 1 
// 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 
// 👍 1197 👎 0

package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

//Java：验证二叉搜索树
public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
        TreeNode treeNode = new TreeNode(5, new TreeNode(4, new TreeNode(1), new TreeNode(7)), new TreeNode(8));
        boolean validBST = solution.isValidBST(treeNode);
        System.out.println(validBST);
        // TO TEST
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    class Solution {

        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        LinkedList<Integer> uppers = new LinkedList<>();
        LinkedList<Integer> lowers = new LinkedList<>();

        public boolean isValidBST(TreeNode root) {
            //  队列先进后出  初始节点
            Deque<TreeNode> stack = new LinkedList<>();
            int inorder = -Integer.MAX_VALUE;

            while (!stack.isEmpty() || root != null) {
                // 把左子树的所有节点都放在队列
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                if (root.val <= inorder) {
                    return false;
                }
                inorder = root.val;
                root = root.right;


            }
            return true;
        }
//            return valid(root, null, null);
//            Integer lower = null, upper = null, val;
//            update(root, upper, lower);
//            while (!treeNodes.isEmpty()) {
//                root = treeNodes.poll();
//                upper = uppers.poll();
//                lower = lowers.poll();
//                if (root == null) {
//                    continue;
//                }
//                val = root.val;
//                if (lower != null && val <= lower) return false;
//                if (upper != null && val >= upper) return false;
//                update(root.left, val, lower);
//                update(root.right, upper, val);
//
//            }
//            return true;
//        }
//
//        public boolean valid(TreeNode node, Integer lower, Integer upper) {
//            if (node == null) {
//                return true;
//            }
//            int val = node.val;
//            if (lower != null && val <= lower) return false;
//            if (upper != null && val >= upper) return false;
//            if (!valid(node.left, lower, val)) return false;
//            if (!valid(node.right, val, upper)) return false;
//            return true;
//        }
//
//        public void update(TreeNode root, Integer upper, Integer lower) {
//            treeNodes.add(root);
//            uppers.add(upper);
//            lowers.add(lower);
//        }

    }


//leetcode submit region end(Prohibit modification and deletion)
}
