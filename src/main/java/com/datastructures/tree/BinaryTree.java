/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures.tree;

import java.util.Deque;
import java.util.LinkedList;

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
     * 1. Visit the root node.
     *
     * 2. Traverse the left subtree in pre-order fashion.
     *
     * 3. Traverse the right subtree in pre-order fashion.
     *
     * @param root The root node.
     */
    public void preOrderRecursive(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrderRecursive(root.getLeft());
            preOrderRecursive(root.getRight());
        }
    }

    public void preOrderIterative() {
        if (root != null) {
            Deque<TreeNode> deque = new LinkedList<>();
            deque.addFirst(root);
            while (!deque.isEmpty()) {
                TreeNode temp = deque.removeFirst();
                System.out.println(temp.getData());
                if (temp.getLeft() != null) {
                    deque.addFirst(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    deque.addFirst(temp.getRight());
                }
            }
        }
    }

    /**
     * 1. Traverse the left subree in in-order fashion.
     *
     * 2. Visit de root node.
     *
     * 3. Traverse the right subtree in in-order fashion.
     *
     * @param root
     */
    public void inOrderRecursive(TreeNode root) {
        if (root != null) {
            inOrderRecursive(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderRecursive(root.getRight());
        }
    }

    public void inOrderIterative() {
        if (root != null) {
            Deque<TreeNode> deque = new LinkedList<>();
            deque.addFirst(root);
            TreeNode temp = root;
            while (!deque.isEmpty() || temp != null) {
                if (temp != null) {
                    deque.addFirst(temp);
                    temp = temp.getLeft();
                } else {
                    temp = deque.removeFirst();
                    System.out.println(temp.getData());
                    temp = temp.getRight();
                }
            }
        }
    }

    /**
     * 1. Traverse the left subtree in post-order fashion.
     *
     * 2. Traverse the right subtree in post-order fashion.
     *
     * 3. Visit the node.
     *
     * @param root
     */
    public void postOrderRecursive(TreeNode root) {
        if (root != null) {
            postOrderRecursive(root.getLeft());
            postOrderRecursive(root.getRight());
            System.out.println(root.getData());
        }
    }

    //17:54
    public void postOrderIterative() {
        if (root != null) {
            TreeNode current = root;
            Deque<TreeNode> deque = new LinkedList<>();
            while (current != null || !deque.isEmpty()) {
                if (current != null) {
                    deque.addFirst(current);
                    current = current.getLeft();
                } else {
                    TreeNode temp = deque.peekFirst().getRight();
                    if (temp == null) {
                        temp = deque.removeFirst();
                        System.out.println(temp.getData() + " ");
                        while (!deque.isEmpty() && temp == deque.peekFirst().getRight()) {
                            temp = deque.removeFirst();
                            System.out.println(temp.getData() + " ");
                        }
                    } else {
                        current = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.postOrderIterative();
    }
}
