public class MainFila {
    public static void main(String[] args) throws Exception {
        Fila objFila = new Fila();

        objFila.insereValor(1);
        objFila.insereValor(3);
        objFila.insereValor(5);
        objFila.insereValor(5);

        objFila.MostraFilaRecursivo();

        objFila.removeValor();
        objFila.MostraFilaRecursivo();

        objFila.removeValor();
        objFila.MostraFilaRecursivo();
    }

}
