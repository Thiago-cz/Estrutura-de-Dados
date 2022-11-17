public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("Teste");
        lista.sortear();

        for (int i = 1; i <= lista.array.length; i++) {
            lista.ordemCres(lista.array[i - 1]);
        }
        System.out.println("\n\n\n");
        lista.imprimir();
    }
}
