public class Fila {
    private int[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila() {
        elementos = new int[100]; // Tamanho máximo da fila é 100
        tamanho = 0; // Inicializa o tamanho como 0 indicando que a fila está vazia
        inicio = 0;
        fim = -1;
    }

    public void enqueue(int valor) {
        if (tamanho < elementos.length) {
            fim = (fim + 1) % elementos.length;
            elementos[fim] = valor;
            tamanho++;
        } else {
            System.out.println("A fila está cheia. Não é possível adicionar elementos.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int valor = elementos[inicio];
            inicio = (inicio + 1) % elementos.length;
            tamanho--;
            return valor;
        } else {
            System.out.println("A fila está vazia. Não é possível remover elementos.");
            return -1; // Valor inválido para indicar que a fila está vazia
        }
    }

    public int rear() {
        if (!isEmpty()) {
            return elementos[fim];
        } else {
            System.out.println("A fila está vazia. Não há elementos no fim.");
            return -1; // Valor inválido para indicar que a fila está vazia
        }
    }

    public int front() {
        if (!isEmpty()) {
            return elementos[inicio];
        } else {
            System.out.println("A fila está vazia. Não há elementos na frente.");
            return -1; // Valor inválido para indicar que a fila está vazia
        }
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
