import java.util.ArrayList;
public class LevelOrderTraversal {
    int val;
    LevelOrderTraversal left;
    LevelOrderTraversal right;

    LevelOrderTraversal(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args){
        LevelOrderTraversal data = new LevelOrderTraversal(25);
        //Fill the tree with the help of constructor

        //Call the level order traversal method here
        //Print the result
        ArrayList<ArrayList<Integer>> result = levelOrder(data);
        System.out.println(result);

    }    

    public static ArrayList<ArrayList<Integer>> levelOrder(LevelOrderTraversal root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        java.util.Queue<LevelOrderTraversal> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                LevelOrderTraversal node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
}
