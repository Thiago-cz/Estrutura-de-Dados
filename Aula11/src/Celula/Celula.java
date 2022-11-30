package Celula;

public class Celula {
    String expressao;
    Celula anterior;
    
    Celula(){

    }

    public Celula(String expressao, Celula anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    public String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    public Celula getAnterior() {
        return this.anterior;
    }

    void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }


}
