public class Celula {
    String expressao;
    Celula anterior;
    
    Celula(){

    }

    Celula(String expressao, Celula anterior) {
        this.expressao  = expressao;
        this.anterior = anterior;
    }

    String getExpressao() {
        return this.expressao;
    }

    void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    
    Celula getAnterior() {
        return this.anterior;
    }

    void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }


}
