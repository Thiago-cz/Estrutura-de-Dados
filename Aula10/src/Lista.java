public class Lista {
    Celula primeira, ultima;
    int tamanho;

    boolean posicaoOcupada(int pos) {
        if ((pos >= 0) && (pos < this.tamanho)) {
            return true;
        } else {
            return false;
        }
    }

    Celula pegarCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posiçao nao existe!");
        } else {
            Celula atual = this.primeira;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }
            return (atual);

        }
    }

    Object pega(int pos) {
        return this.pegarCelula(pos).getElement();
    }

    void addInicio(Object elemento) {

        if (this.tamanho == 0) {
            Celula nova = new Celula(primeira, elemento);
            primeira = nova;
            ultima = primeira;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.tamanho++;
    }

    void addFinal(Object elemento) {
        if (tamanho == 0) {
            this.addInicio(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(ultima);
            this.ultima = nova;
            tamanho++;
        }
    }

    void addMeio(int pos, Object elemento) {
        if (pos == 0) {
            addInicio(elemento);
        } else {
            if (pos == tamanho) {
                addFinal(elemento);
            } else {
                Celula anterior = this.pegarCelula(pos - 1);
                Celula proxima = anterior.getProxima();
                Celula nova = new Celula(anterior.getProxima(), elemento);

                nova.setAnterior(anterior);
                anterior.setProxima(nova);
                proxima.setAnterior(nova);
                tamanho++;
            }
        }
    }

    void removerInicio() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição não existe!");
        } else {
            this.primeira = this.primeira.getProxima();
        }
        if (tamanho == 0) {
            this.ultima = null;
        }
    }

    void removerFim() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição não existe!");
        } else {
            if (tamanho == 1) {
                removerInicio();
            } else {
                Celula anterior = this.ultima.getAnterior();
                anterior.setProxima(null);
                ultima = anterior;
                tamanho--;
            }
        }
    }

    void removerMeio(int pos) {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição não existe!");
        } else {
            if (pos == 0) {
                removerInicio();
            } else {
                if (pos == tamanho - 1) {
                    removerFim();
                }else {
                    Celula anterior = this.pegarCelula(pos -1);
                    Celula atual = anterior.getProxima();
                    Celula proxima = atual.getProxima();

                    anterior.setProxima(proxima);
                    proxima.setAnterior(anterior);
                    tamanho--;
                }
            }
        }
    }

    Boolean contem(Object elemento) {
        Celula atual = this.primeira;

        while (atual != null) {
            if (atual.getElement().equals(elemento)) {
                return true;
            }

            atual = atual.getProxima();
        }
        return false;
    }

    void clearLista() {
        this.primeira = null;
        this.ultima = null;
        tamanho = 0;
    }

    
}