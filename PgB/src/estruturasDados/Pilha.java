package estruturasDados;

public class Pilha {
    private int[] pilha;
    private int tamanhoM;
    private int topo;

    public Pilha(int tamanhoM) {
        this.pilha = new int[tamanhoM];
        this.tamanhoM = tamanhoM;
        this.topo = -1;
    }

    public void empilha(int elemento) {
        if (cheia()) {
            System.out.println("A pilha esta cheia");
        } else {
            topo++;
            pilha[++topo] = elemento;
        }
    }

    public int desempilha() {
        if (vazia()) {
            System.out.println("A pilha esta vazia");
            return -1;
        } else {
            int elemento = pilha[topo];
            topo--;
            return elemento;
        }
    }

    public int topo(){
        if(vazia()){
            System.out.println("A pilha está vazia");
            return -1;
        }else{
            return pilha[topo];
        }
    }

    public boolean vazia(){
        return topo == -1;
        // fazer teste sem o if
    }

    public boolean cheia(){
        return topo == tamanhoM -1;
    }

    public int tamanho(){
        return topo+1;
    }

    public void percorrerPilha() {
        if (vazia()) {
            System.out.println("A pilha esta vazia");
            return;
        }

        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + "  ");
        }
        System.out.println();
    }
}

