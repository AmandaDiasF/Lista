package lista;

import lista.FilaCircular;

public class TesteFila {
    public static void main(String[] args) {
        FilaCircular<Integer> fila = new FilaCircular<>(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Existe 20? " + fila.existe(20)); // true
        System.out.println("Existe 50? " + fila.existe(50)); // false
    }
}