package data_structure;
import java.util.*;
class Node1{
    int data;
    Node1 left,right;
    Node1(int val){
        data = val;
        left=right=null;
    }
}
class DfsAndBfs {
    Node1 root;

    DfsAndBfs() {
        root = null;
    }

    void pre_order(Node1 rot) {
        if (rot == null) {
            return;
        }
        System.out.print(rot.data);
        pre_order(rot.left);
        pre_order(rot.right);
    }

    void In_order(Node1 rot) {
        if (rot == null) {
            return;
        }
        In_order(rot.left);
        System.out.print(rot.data);
        In_order(rot.right);
    }

    void Post_order(Node1 rot) {
        if (rot == null) {
            return;
        }
        Post_order(rot.left);
        Post_order(rot.right);
        System.out.print(rot.data);
    }
}
public class traval {
    public static void main(String arg[]){
        int ch;
        System.out.println("This is a BFS AND DFS traversal");
        DfsAndBfs obj = new DfsAndBfs();
        obj.root = new Node1(8);
        obj.root.left=new Node1(5);
        obj.root.right=new Node1(15);
        obj.root.left.left=new Node1(3);
        obj.root.left.right=new Node1(7);
        obj.root.right.left=new Node1(10);
        obj.root.right.right=new Node1(20);
        System.out.println("*************** TREE TRAVERSAL ***************");
        do {
            System.out.println();
            System.out.println("##############  MANU ##############");
            System.out.println("1.PRE_ORDER");
            System.out.println("2.POST_ORDER");
            System.out.println("3.IN_ORDER");
            System.out.println("4.End");
            System.out.println("Enter the Choice =>>");
            Scanner input = new Scanner(System.in);
            ch = input.nextInt();
            switch(ch){
                case 1:
                    System.out.println("In pre Order traversal ==>>");
                    obj.pre_order(obj.root);
                    break;
                case 2:
                    System.out.println("In the In order traversal ==>>");
                    obj.In_order(obj.root);
                    break;
                case 3:
                    System.out.println("In the post order traversal ==>>");
                    obj.Post_order(obj.root);
                    break;
                case 4:
                    System.out.println("Exit");
            }
        }while(ch<4);
    }
}
