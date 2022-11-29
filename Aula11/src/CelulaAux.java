public class CelulaAux {
    String expressao;
    CelulaAux anterior;
    
    CelulaAux(){}

    CelulaAux(String expressao, CelulaAux anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    CelulaAux getAnterior() {
        return this.anterior;
    }

    void setAnterior(CelulaAux anterior) {
        this.anterior = anterior;
    }
}
