public class Main {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();
        
        if(pilha.vefExpressao("3* {23 * [24 + (3-7) * (28 / 12)] - [34 + (56 + 9) - (23 *2 )]}")) {
            System.out.println("A expressao esta digitada corretamente!!!");
        }else {
            System.out.println("A expressao esta digitada incorretamente!!!");
        }
    }
}
