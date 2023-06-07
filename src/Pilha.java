public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha() {
        elementos = new int[100]; // Tamanho máximo da pilha é 100
        topo = -1; // Inicializa o topo como -1 indicando que a pilha está vazia
    }

    public void push(int valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
        } else {
            System.out.println("A pilha está cheia. Não é possível adicionar elementos.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int valor = elementos[topo];
            topo--;
            return valor;
        } else {
            System.out.println("A pilha está vazia. Não é possível remover elementos.");
            return -1; // Valor inválido para indicar que a pilha está vazia
        }
    }

    public int top() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            System.out.println("A pilha está vazia. Não há elementos no topo.");
            return -1; // Valor inválido para indicar que a pilha está vazia
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }
}
