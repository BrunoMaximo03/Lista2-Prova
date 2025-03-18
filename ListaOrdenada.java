public class ListaOrdenada {
    private int array[];
    private int n;

    public ListaOrdenada() {
        this(6);
    }
    
    public ListaOrdenada(int tamnaho) {
        array = new int[tamnaho];
        n = 0;
    }

    public void inserir(int valor) throws Exception {
        if(n >= array.length) {
            throw new Exception("ERRO: falha ao inserir elemento. Lista cheia!");
        }

        int pos;

        for(pos = n - 1; pos >= 0 && array[pos] > valor; pos--) {
            array[pos + 1] = array[pos];
        }
        array[pos + 1] = valor;
        n++;
    }

    public int removeInicio() throws Exception {
        if(n == 0) {
            throw new Exception("ERRO: falha em remover elemento do inicio. Array vazio!");
        }
        int resp = array[0];
        n--;
        for(int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }
        return resp;
    }

    public int removeFim() throws Exception {
        if(n == 0) {
            throw new Exception("ERRO: falha ao remover elemento do final. Array vazio");
        }
        int resp = array[n];
        n--;
        return resp;
    }

    public int remover(int posicao) throws Exception {
        if(n == 0) {
            throw new Exception("ERRO: falha ao remover elemento do final. Array vazio");
        }
        if(posicao < 0 || posicao > n) {
            throw new Exception("ERRO: falha ao inserir nessa posicao. Fora dos intervalos!");
        }

        int resp = array[posicao];
        n--;

        for(int i = posicao; i < n; i++) {
            array[i] = array[i + 1];
        }
        return resp;
    }

    public boolean ehOrdenado() {
        boolean estaOrdenado = true;
        for(int i = 0; i < n; i++) {
            if(array[i] > array[i+1]) {
                estaOrdenado = false;
                i = n;
            }
        }
        return estaOrdenado;
    }

    public boolean pesquisaElemento(int valor) {
        boolean achou = false;
        for(int i = 0; i < n && achou == false; i++) {
            if(array[i] == valor) {
                i = n;
                achou = true;
            }
        }
        return achou;
    }

    public void mostraLista() {
        System.out.print("[");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}

