
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

    public void inserirElementoInicio(int elemento) throws Exception { // insere no INICIO
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

    public void inserirElementoFim(int elemento) throws Exception { // insere no FINAL
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
                    "Falha ao inserir elemento na posicao. O numero de elementos no array e maior do que o tamanho pre-definido.");
        }
        if (posicao < 0 || posicao > n) {
            throw new Exception("Falha ao inserir elemento na posicao " + posicao + ". Posicao indisponivel!");
        }
        for (int i = n; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
        n++;
    }

    public int removeElementoInicio() throws Exception { // remove no INICIO
        if (n == 0) {
            throw new Exception("Erro ao tentar remover o elemento da posicao INICIO array esta vazio!");
        }
        int resp = array[0];
        n--;
        for (int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    public int removeElementoFim() throws Exception { // remove no FINAL
        if (n == 0) {
            throw new Exception("Erro ao remover elemento da posicao FIM do array.");
        }
        int resp = array[n - 1];
        n--;
        return resp;
    }

    public int removeElementoPosicaoDesejada(int posicao) throws Exception { // remove na posicao POS
        if (n == 0) {
            throw new Exception("Erro ao remover posicao desejada, o array esta vazio.");
        }
        if (posicao < 0 || posicao >= n) {
            throw new Exception(
                    "Erro ao remover elemento da posicao desejada. Posicao eh maior ou menor que o array pre-definido");
        }

        int resp = array[posicao];
        n--;

        for (int i = posicao; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    public void mostraLista() {             //MOSTRANDO elementos da LISTA
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public boolean procuraElemento(int elemento) {
        boolean retornoPesquisa = false;
        for(int i = 0; i < n && retornoPesquisa == false; i++) {
            retornoPesquisa = (array[i] == elemento);   
        }
        return retornoPesquisa;
    }
}
