

public class Fila {
    private int array[];
    private int primeiro; // posicao onde será removido o valor q tiver nela
    private int ultimo; // proxima posicao onde será inserido algum valor

    public Fila() {
        this(6);
    }

    public Fila(int tamanho) {
        array = new int[tamanho + 1];
        primeiro = ultimo = 0;
    }

    public void insereValor(int valor) throws Exception {
        if(((ultimo + 1) % array.length) == primeiro) {
            throw new Exception("ERRO: falha ao inserir novo termo. Lista cheia!"); 
        }
        array[ultimo] = valor;
        ultimo = ((ultimo + 1) % array.length); // atualizando a proxima posicao disponivel
    }

    public int removeValor() throws Exception {
        if(ultimo == primeiro) {
            throw new Exception("ERRO: falha ao remover termo. Lista vazia!");
        }
        int resp = array[primeiro];
        primeiro = ((primeiro + 1) % array.length);

        return resp;
    }

    public void mostraFila() {
        System.out.println("[");
        for(int i = primeiro; i != ultimo; i = ((primeiro + 1) % array.length)) {
            System.out.println(array[i] + " ");
        }
        System.out.println("]");
    }

    public void MostraFilaRecursivo() {
        System.out.println("[");
        MostraFilaRecursivo(primeiro);
        System.out.println("]");
    }

    public void MostraFilaRecursivo(int contador) {
        if(contador != ultimo) {
            System.out.println(array[contador] + " ");
            MostraFilaRecursivo((contador + 1) % array.length);
        }
    }
}