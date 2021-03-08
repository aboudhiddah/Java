package com.graph;

public class NodeTree {
    int value;
    NodeTree right;
    NodeTree left;

    public NodeTree(int Value, NodeTree right, NodeTree left) {
        this.value =Value;
        this.right=right;
        this.left=left;
    }
}
