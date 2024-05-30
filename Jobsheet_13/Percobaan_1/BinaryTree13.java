package Percobaan_1;

public class BinaryTree13 {
    Node13 root;

    public BinaryTree13() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        root = addRecursive(root, data);
        // Node13 newNode = new Node13(data);
        // if (isEmpty()) {
        //     root = newNode;
        // } else {
        //     Node13 current = root;
        //     Node13 parent;
        //     while (true) {
        //         parent = current;
        //         if (data < current.data) {
        //             current = current.left;
        //             if (current == null) {
        //                 parent.left = newNode;
        //                 return;
        //             }
        //         } else {
        //             current = current.right;
        //             if (current == null) {
        //                 parent.right = newNode;
        //                 return;
        //             }
        //         }
        //     }
        // }
    }

    public Node13 addRecursive(Node13 current, int data) {
        if (current==null) {
            return new Node13(data);
        }
        if (data<current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data>current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    public boolean find(int data) {
        Node13 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void traversePreOrder(Node13 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node13 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node13 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public Node13 getSuccessor(Node13 delNode) {
        Node13 successorParent = delNode;
        Node13 successor = delNode;
        Node13 current = delNode.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public boolean delete(int data) {
        Node13 parent = root;
        Node13 current = root;
        boolean isLeftChild = false;
        while (current.data != data) {
            parent = current;
            if (current.data > data) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }

        else if (current.left != null && current.right != null) {
            Node13 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public int findMinValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return Integer.MIN_VALUE;
        }
        Node13 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMaxValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return Integer.MAX_VALUE;
        }
        Node13 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void printLeafNodes() {
        displayLeafData(root);
    }

    public void displayLeafData(Node13 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        displayLeafData(node.left);
        displayLeafData(node.right);
    }

    public int countLeafNodes() {
        return countLeafNodesRekursif(root);
    }

    public int countLeafNodesRekursif(Node13 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodesRekursif(node.left) + countLeafNodesRekursif(node.right);
    }
}
