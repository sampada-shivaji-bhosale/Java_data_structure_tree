package data_structure;

class Node{
    int data;
    Node left ,right;
    Node(int val){
        data=val;
        left=right=null;
    }
}
class Insert{
    Node root;
    Insert(){
        root=null;// initially condition.
    }
    void traversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data);
        System.out.println("Node Data :"+node.data);
        traversal(node.left);
        traversal(node.right);

    }
}
public class Tree {
    public static void main(String arg[]){
        Insert obj1 = new Insert();
        obj1.root = new Node(6);
        obj1.root.left = new Node(5);
        obj1.root.right = new Node(7);
        obj1.traversal(obj1.root);
    }

}

