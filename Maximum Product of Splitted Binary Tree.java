

https://course.acciojob.com/idle?question=d9c74b53-b470-4fce-9d24-879f3679b524


import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution {
   static long res = 0;
	static int sum = 0;
    public static int maxProduct(TreeNode root) {
        Sum(root);
        rec(root);
        return (int)(res%1000000007);
    }
    private static void Sum(TreeNode node) {
        if(node == null) return;
        sum+=node.data;
        Sum(node.left);
        Sum(node.right);
    }
    private static int rec(TreeNode root) {
        if(root == null) return 0;
        int curr = root.data + rec(root.left) + rec(root.right);
        res = Math.max(res, (sum - curr) * (long)curr);
        return curr;
    }
}



class Main {
    public static TreeNode buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 
			'N')
            return null;

        String[] nodes = str.split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {

            TreeNode currNode = queue.poll();

            String currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= nodes.length)
                break;
            currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeNode root = buildTree(s);
        int maxPath = Solution.maxProduct(root);
        System.out.println(maxPath);
    }
}
