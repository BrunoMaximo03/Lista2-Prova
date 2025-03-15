import java.util.*;

public class ListaLinear {
    private int array[];
    private int n;

    public ListaLinear() {
        this(6);
    }

    public ListaLinear(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    public void inserirElementoInicio(int elemento) throws Exception { // insere no Inicio
        if (n >= array.length) {
            throw new Exception(
                    "Falha ao inserir elemento no inicio. O numero de elementos no array e maior do que o tamanho pre-definido.");
        }

        for (int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = elemento;
        n++; // atualizando a lista, após adicionar um elemento;
    }

    public void inserirElementoFim(int elemento) throws Exception { // insere no final
        if (n >= array.length) {
            throw new Exception(
                    "Falha ao inserir elemento no final. O numero de elementos no array e maior do que o tamanho pre-definido.");
        }
        array[n] = elemento;
        n++;
    }

    public void inserirElementoPosicaoDesejada(int elemento, int posicao) throws Exception { // insere na posicao "POS"
        if (n >= array.length) {
            throw new Exception(
                    "Falha ao inserir elemento no final. O numero de elementos no array e maior do que o tamanho pre-definido.");
        }
        if (posicao < 0 || posicao > n) {
            throw new Exception("Falha ao inserir elemento na posicao " + posicao + ". Posicao indisponivel!");
        }
        for (int i = n; i > posicao; i++) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
    }

    public int removeElementoInicio() throws Exception {
        if (n == 0) {
            throw new Exception("Erro ao tentar remover o elemento da posicao 0. O array esta vazio!");
        }
        int resp = array[0];
        n--;
        for (int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }
}
