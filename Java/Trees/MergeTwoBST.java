package Trees;
import java.util.ArrayList;


public class MergeTwoBST{
    public static void main(String[] args){
        // You can test the merge method here if needed
    }

    public static ArrayList<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        inorder(root1, list1);
        inorder(root2, list2);
        
        return mergeArrayList(list1, list2);
    }
    
    public static void inorder(Node root,ArrayList<Integer> list){
        if(root != null){
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
        }
    }

    // Define your own Node class for BST
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static ArrayList<Integer> mergeArrayList(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> merge = new ArrayList<>();

        int i = 0, j = 0;

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) > list2.get(j)){
                merge.add(list2.get(j));
                j += 1;
            }
            else{
                merge.add(list1.get(i));
                i += 1;
            }

        }

        while(i < list1.size()){
            merge.add(list1.get(i));
            i += 1;
        }

        while(j < list2.size()){
            merge.add(list2.get(j));
            j += 1;
        }

        return merge;
    }
}