package lista;

public class FilaCircular<T> {
    private T[] elementos;
    private int inicio, fim, tamanho, capacidade;


    public FilaCircular(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public boolean enqueue(T elemento) {
        if (isFull()) return false;
        elementos[fim] = elemento;
        fim = (fim + 1) % capacidade;
        tamanho++;
        return true;
    }

 
    public boolean existe(T elemento) {
        if (isEmpty()) return false;

        int index = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[index].equals(elemento)) {
                return true;
            }
            index = (index + 1) % capacidade;
        }
        return false;
    }
}
