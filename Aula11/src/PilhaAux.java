public class PilhaAux {
    CelulaAux topo = null;

    void push(String expressao) {
        CelulaAux nova = new CelulaAux(expressao, topo);
        this.topo = nova;
    }

    void pop() {
        if(!isEmpty()){
            System.out.println("Retirando o elemento da pilha..: " + this.topo.getExpressao());
            this.topo = this.topo.getAnterior();
        }else {
            System.out.println("Pilha vazia!");
        }
    }

    boolean isEmpty() {
        if(this.topo == null) {
            return true;
        }
        return false;
    }

    int sizePilha() {
        CelulaAux p;
        int cont = 0;
        p = topo;
        while(p!=null) {
            p = p.getAnterior();
            cont++;
        }
        return cont;
    }

    void imprimir() {
        CelulaAux p = topo;
        if(isEmpty()) {
            System.out.println("Pilha vazia!!!");
        }else{
            while(p!=null) {
                System.out.println("Nome da pilha.::" + p.getExpressao());
                p = p.getAnterior();
            }
        }
    }

    void topo() {
        if(isEmpty()){
            System.out.println("Pilha vazia!!!");
        }else {
            System.out.println("Topo da pilha eh.::" + topo.getExpressao());
        }
    }
    
}
