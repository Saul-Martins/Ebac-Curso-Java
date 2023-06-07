public class MapaHash {
    private static final int SIZE = 10;
    private ListaEncadeada[] array;

    public MapaHash() {
        array = new ListaEncadeada[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = new ListaEncadeada();
        }
    }

    public void put(int key, int value) {
        int index = hash(key);
        array[index].push(new Node(key, value));
    }

    public void delete(int key) {
        int index = hash(key);
        array[index].removeByKey(key);
    }

    public int get(int key) {
        int index = hash(key);
        Node node = array[index].getNodeByKey(key);
        if (node != null) {
            return node.getValue();
        }
        return -1; // Valor padrão para indicar que a chave não foi encontrada
    }

    public void clear() {
        for (int i = 0; i < SIZE; i++) {
            array[i].clear();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    private class Node {
        private int key;
        private int value;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
