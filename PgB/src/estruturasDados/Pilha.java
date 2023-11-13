package estruturasDados;

public class Pilha {
    private int[] pilha;
    private int tamanhoM;
    private int cima;

    public Pilha(int tamanhoM) {
        this.pilha = new int[tamanhoM];
        this.tamanhoM = tamanhoM;
        this.cima = -1;
    }

    public void empilha(int elemento) {
        if (cheia()) {
            System.out.println("A pilha esta cheia");
        } else {
            cima++;
            pilha[++cima] = elemento;
        }
    }

    public int desempilha() {
        if (vazia()) {
            System.out.println("A pilha esta vazia");
            return -1;
        } else {
            int elemento = pilha[cima];
            cima--;
            return elemento;
        }
    }

    public int cima(){
        if(vazia()){
            System.out.println("A pilha está vazia");
            return -1;
        }else{
            return pilha[cima];
        }
    }

    public boolean vazia(){
        return cima == -1;
    }

    public boolean cheia(){
        return cima == tamanhoM -1;
    }

    public int tamanho(){
        return cima +1;
    }

    public void percorrePilha() {
        if (vazia()) {
            System.out.println("A pilha esta vazia");
            return;
        }

        for (int i = cima; i >= 0; i--) {
            System.out.print(pilha[i] + "  ");
        }
        System.out.println();
    }
}

