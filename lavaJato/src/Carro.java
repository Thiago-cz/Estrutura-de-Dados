public class Carro {
    String modelo, marca, dono; 
    int idCarro;


    void cadCarro(Object obj, String modelo, String marca, String dono, int idCarro){
        ((Carro)obj).modelo = modelo;
        ((Carro)obj).marca = marca;
        ((Carro)obj).dono = dono;
        ((Carro)obj).idCarro = idCarro;
    }
}
