package Celula;

public class CelulaAux {
    String expressao;
    CelulaAux anterior;
    
    CelulaAux(){}

    public CelulaAux(String expressao, CelulaAux anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    public String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    public CelulaAux getAnterior() {
        return this.anterior;
    }

    void setAnterior(CelulaAux anterior) {
        this.anterior = anterior;
    }
}
