
public class MainListaLinear {
    public static void main(String[] args) throws Exception {
        
        System.out.println("-------- LISTA LINEAR ---------");

        ListaLinear lista = new ListaLinear(6);
        int x1, x2, x3;
        try {
        lista.inserirElementoInicio(1);
        lista.inserirElementoInicio(0);
       
        lista.inserirElementoFim(2);
        lista.inserirElementoFim(3);
        
        lista.inserirElementoPosicaoDesejada(4, 3);
        lista.inserirElementoPosicaoDesejada(5, 2);

        System.out.println("Numeros inseridos: ");
        lista.mostraLista();

        x1 = lista.removeElementoInicio();
        x2 = lista.removeElementoFim();
        x3 = lista.removeElementoPosicaoDesejada(2);

        System.out.println("Apos remocoes (" + x1 + ", " + x2 + ", " + x3 + "):");
        lista.mostraLista();
        System.out.println(lista.procuraElemento(4) ? "SIM" : "NAO");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Tentando acessar posicao inex");
        }
    }
}
