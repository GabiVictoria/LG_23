package estruturasDados;

public class Lista <T>{
    private Node<T> head;
    private int tam;

    public static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public Lista(){
        this.head = null;
        this.tam = 0;
    }

    public int getTam(){
        return tam;
    }

    // exibe lista
    public void exibir(){
        Node<T> current = head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
        System.out.printf("  ");
    }

    //adiciona elemento na primeira posição
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head==null){
            head=newNode;
        }else{
            Node<T> current = head;
            while(current.next != null){
                //enquanto existir proximo, não fica null
                current = current.next;
                // aponta para o novo nó criado
            }
            current.next = newNode;
        }
        tam++;
    }

    //adicionar em qualquer posição na lista
    public void addAtIndex(int index, T data) {
        if (index < 0 || index > tam) {
            throw new IndexOutOfBoundsException("indice fora dos limites.");
        }
        Node<T> newNode = new Node<>(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        tam++;
    }

    //adicionar um elemento na primeira posição
    public void addToFront(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        tam++;
    }


    //remover um elemento na primeira posição
    public void remove(){
        if (head == null) {
            return; //Lista vazia,nada para remover.
        }

        if (tam == 1) {
            head = null;
        } else {
            head = head.next;
        }

        tam--;
    }

    //remover um elemento em qualquer posição
    public void removeAtIndex(int index) {
        if (index < 0 || index >= tam) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        tam--;
    }

    //remove elemento na ultima posição
    public void removeUltimo() {
        if (head == null) {
            return;
        }

        if (tam == 1) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        tam--;
    }

    public Node<T> getHead() {
        return head;
    }

    // percorre a lista
    public void percorreLista() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // busca e retorna valor numa determinada posição
    public T returnValor(int index) {
        if (index < 0 || index >= tam) {
            throw new IndexOutOfBoundsException("indice fora dos limites");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
}
