package algorithm;

/**
 * 二叉树的基本操作:创建一颗二叉树
 */
public class BinaryTree {

    private static class Node<E> {
        E item;
        Node<E> left;
        Node<E> right;

        Node() {

        }

        Node(E item, Node<E> left, Node<E> right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 创建一个完全二叉树: 96 /  \ 83   27 /  \ 39   30
     */
    public Node createFullBinaryTree(Integer[] arr) {
        if (arr.length == 0) {
            return new Node<>();
        }
        Node root = new Node<>(arr[0], null, null);
        for (Integer i : arr) {

        }
        return root;
    }

    /*private Node createLeftNode(Node father, Node left) {
        // 父节点右子树为空,返回父节点
        if (father.right == null) {
            father.left = left;
            return father;
        }
    }*/
}
