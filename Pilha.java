public class Pilha {
    int array[];
    int n;


    public Pilha() {
        this(6);
    }
    
    public Pilha(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    public void insere(int valor) throws Exception {
        if(n >= array.length) {
            throw new Exception("ERRO: falha ao adicionar elemento. Pilha cheia.");
        }
        array[n] = valor;
        n++;
    }

    public int remover() throws Exception {
        if(n == 0) {
          throw new Exception("ERRO: falha ao remover elemento. Pilha vazia.");
        }
        return array[n--];
    }

    void mostraPilha() {
        System.out.println("========");
        for(int i = n-1 ; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
