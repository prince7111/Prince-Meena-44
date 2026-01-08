public class BST_1 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int d) {
            this.data = d;
        } 
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val<root.data){
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
        int values[] = {116, 29 ,174 ,87,261,58, 145,203, 232,290};
        Node r = null;
        for(int i=0;i<values.length;i++){
            r = insert(r,values[i]);
        }
        inorder(r);
        System.out.println();

        
    }
}
