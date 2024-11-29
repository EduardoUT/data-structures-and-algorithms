/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.tree;

/**
 * This data-structor is non-lineal and consists of a set of nodes, each node
 * has three parts:
 *
 * 1. left: A pointer to te left side.
 *
 * 2. data: Any generic type of data.
 *
 * 3. right: A pointer to the right side.
 *
 * A binary-tree has two principal parts:
 *
 * 1. A root node, which is the start.
 *
 * 2. A leaf node, which is the bottom-most node.
 *
 * The relation from top to bottom is top(parent-node) and subsecuent in left or
 * right are (children-nodes).
 *
 * -----------------(1)
 *
 * ----------------/---\
 *
 * --------------(2)---(5)
 * 
 * -------------/---\
 *
 * -----------(3)---(4)
 *
 * @author eduar
 */
public class BinaryTree {

    private TreeNode root;

    /**
     * @return the root
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * Creating a manually representation of a BinaryTree.
     */
    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // root ---> first
        first.setLeft(second); // second <--- first ---> null
        first.setRight(third); // second <--- first ---> third
        second.setLeft(fourth); // fourth <--- second ---> null
        second.setRight(fifth); // fourth <--- second ---> fifth
    }

    /**
     * Traversing a BinaryTree in pre-order style in recursive way.
     *
     * @param root The root node.
     */
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.getRoot());
    }
}
