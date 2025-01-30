package Ejercicios;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class arbolBinario {

    public TreeNode findInOrderSuccessor(TreeNode root, TreeNode node) {
        if (node.right != null) {
            return findMin(node.right);
        }

        TreeNode successor = null;
        while (root != null) {
            if (node.value < root.value) {
                successor = root;
                root = root.left;
            } else if (node.value > root.value) {
                root = root.right;
            } else {
                break;
            }
        }
        return successor;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        // Crear un árbol binario de búsqueda
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(35);

        arbolBinario bst = new arbolBinario();
        TreeNode node = root.right; // Nodo con valor 30
        TreeNode successor = bst.findInOrderSuccessor(root, node);

        if (successor != null) {
            System.out.println("El sucesor in-order de " + node.value + " es: " + successor.value);
        } else {
            System.out.println("No hay sucesor in-order para el valor " + node.value);
        }
    }
}
