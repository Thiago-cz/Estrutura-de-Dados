public class Main {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        if(pilha.vefExpressao()) {
            System.out.println("A expressao esta digitada corretamente!!!");
        }else {
            System.out.println("A expressao esta digitada incorretamente!!!");
        }
    }
}
