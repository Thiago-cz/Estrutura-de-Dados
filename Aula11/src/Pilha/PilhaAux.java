package Pilha;
import Celula.CelulaAux;

public class PilhaAux {
    CelulaAux topo = null;

    void push(String expressao) {
        CelulaAux nova = new CelulaAux(expressao, topo);
        this.topo = nova;
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
}
