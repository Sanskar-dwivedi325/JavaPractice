package BinaryTree;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTreeOperations{
Node root=null;

   public void inserti(int data){
       root=insert(root,data);
   }
    public Node insert(Node root,int data){

        Node temp=new Node(data);
        if(root==null){
            root=temp;
            return root;
        }
        if(root.data>data){
            root.left=insert(root.left,data);

        }
        else{
            root.right=insert(root.right,data);
        }
return root;
    }

    public void InorderTraversel(Node root){
        if(root==null)return;
        InorderTraversel(root.left);
        System.out.println(root.data);
        InorderTraversel(root.right);
    }
}

public class BinaryTree {


    public static void main(String[] args) {
     /*   Node roota=new Node(10);
        Node B =new Node(20);
        Node C=new Node(30);
        roota.left=B;
        roota.right=C;

        Node D=new Node(40);
        Node E=new Node(50);
        B.left=D;
        B.right=E;
        Node f=new Node(60);
        Node g=new Node(70);
        C.left=f;
        C.right=g;*/

        BinaryTreeOperations bt=new BinaryTreeOperations();
        bt.inserti(10);
        bt.inserti(8);
        bt.inserti(12);
        bt.inserti(7);
        bt.inserti(9);
        bt.inserti(11);
        bt.inserti(13);
        bt.inserti(19);
        bt.InorderTraversel(bt.root);



    }
}
