package EstruturaDados;

public class Lista <T>{
    private no<T> head;
    private int tamanho;

    public static class no<T>{
        private T data;
        private no<T> next;

        public no(T data){
            this.data = data;
            this.next = null;
        }
    }

    public Lista(){
        this.head = null;
        this.tamanho = 0;
    }

    public int getTamanho(){
        return tamanho;
    }

    // método para exibição da lista
    public void exibir(){
        no<T> current = head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
        System.out.printf(" ");
    }

    //adicionar um elemento na primeira posição
    public void add(T data){
        no<T> newNo = new no<>(data);
        if(head==null){
            head= newNo;
        }else{
            no<T> current = head;
            while(current.next != null){
                //enquanto corrente tiver proximo, não é null
                current = current.next;
                // aponta para o novo nó que foi criado
            }
            current.next = newNo;
        }
        tamanho++;
    }

    //adicionar um elemento em qualquer posição da lista
    public void addAtIndex(int index, T data) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
        }
        no<T> newNo = new no<>(data);

        if (index == 0) {
            newNo.next = head;
            head = newNo;
        } else {
            no<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNo.next = current.next;
            current.next = newNo;
        }

        tamanho++;
    }

    //adicionar um elemento na primeira posição
    public void addPrimeiraP(T data) {
        no<T> newNo = new no<>(data);
        newNo.next = head;
        head = newNo;
        tamanho++;
    }


    //remover um elemento na primeira posição
    //tem que arrumar
    public void removerPrimeiraP(){
            if (head == null) {
                return;
            }

            if (tamanho == 1) {
                head = null;
            } else {
                head = head.next;
            }

            tamanho--;
        }

    //remover um elemento em qualquer posição
    public void removeAtIndex(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
        }

        if (index == 0) {
            head = head.next;
        } else {
            no<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        tamanho--;
    }

    //remove um elemento na última posição
    public void removerUltimaP() {
        if (head == null) {
            return;
        }

        if (tamanho == 1) {
            head = null;
        } else {
            no<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        tamanho--;
    }

    public no<T> getHead() {
        return head;
    }

    // percorrer a lista
    public void percorrerLista() {
        no<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // método que busca retornar um valor numa determinada posição
    public T retornarValor(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");
        }
        no<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

}