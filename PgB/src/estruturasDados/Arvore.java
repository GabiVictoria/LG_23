package estruturasDados;
public class Arvore {
    private Node root;
    private class Node {
        private int key;
        private Node left, right;
        public Node(int key) {
            this.key = key;
        }
    }
    public void add(int key) {
        root = add(root, key);
    }
    private Node add(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = add(node.left, key);
        } else if (key > node.key) {
            node.right = add(node.right, key);
        }
        return node;
    }
    public void remove(int key) {
        root = remove(root, key);
    }
    private Node remove(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.key) {
            node.left = remove(node.left, key);
        } else if (key > node.key) {
            node.right = remove(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node minNode = acheMin(node.right);

                node.key = minNode.key;
                node.right = remove(node.right, minNode.key);
            }
        }
        return node;
    }
    private Node acheMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    public void ordem() {
        emOrdem(root);
    }
    private void emOrdem(Node node) {
        if (node != null) {
            emOrdem(node.left);
            System.out.print(node.key + " ");
            emOrdem(node.right);
        }
    }
    public void preorder() {
        preorder(root);
    }
    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void postorder() {
        postorder(root);
    }
    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key + " ");
        }
    }
    public void printArvore() {
        if (root == null) {
            System.out.println("Árvore está vazia");
        } else {
            System.out.print("Elementos da árvore: ");
            printArvore(root);
            System.out.println();
        }

    }
    private void printArvore(Node node) {
        if (node != null) {
            printArvore(node.left);
            System.out.print(node.key + " ");
            printArvore(node.right);
        }
    }

    public int getTam() {
        return getTam(root);
    }

    private int getTam(Node node) {
        if (node == null) {
            return 0;
        }
        return getTam(node.left) + getTam(node.right) + 1;
    }
}
// O getTam mostra que o tamanho da árvore é igual ao tamanho da subárvore direita + tamanho da subárvore esquerda + um; (para o nó atual)