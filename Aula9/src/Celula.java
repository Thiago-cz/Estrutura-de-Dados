public class Celula {
    Celula proximo;
    Object elemento;
    
    public Celula(Object elemento){
        this.elemento = elemento;
    }
    public Celula(Celula proximo, Object elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }

    void setProximo(Celula proximo){
        this.proximo = proximo;
    }

    Celula getProximo(){
        return this.proximo;
    }

    Object getElement(){
        return this.elemento;
    }

}
