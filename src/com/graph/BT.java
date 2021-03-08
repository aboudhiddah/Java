package com.graph;

public class BT {
    NodeTree root;
    public BT(NodeTree root) {
        this.root=root;
    }
    public void addNode(NodeTree newNode, NodeTree rootExplore) {
        if (rootExplore==null)
            return;
        if(newNode.value >rootExplore.value){
            if(rootExplore.right==null)
                rootExplore.right= newNode;
            else
                addNode(newNode, rootExplore.right);
        }
        if(newNode.value <rootExplore.value){
            if(rootExplore.left==null)
                rootExplore.left= newNode;
            else
                addNode(newNode, rootExplore.left);
        }


    }
    public void Search(int Value, NodeTree rootExplore) {
        if (rootExplore==null){
            System.out.println("The Value Is not Founded");
            return;

        }

        if (rootExplore.value ==Value){
            System.out.println("The Value Is Founded");
        }
        if(Value>rootExplore.value){

                Search(Value, rootExplore.right);
        }
        if(Value<rootExplore.value){

                Search(Value, rootExplore.left);
        }


    }


}


