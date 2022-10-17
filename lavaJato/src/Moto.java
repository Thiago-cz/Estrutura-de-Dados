
public class Moto {
    String modelo, marca, cor, dono; 
    int idMoto;

    void cadMoto(Object obj, String modelo, String marca, String dono, int idMoto){
        ((Moto)obj).modelo = modelo;
        ((Moto)obj).marca = marca;
        ((Moto)obj).dono = dono;
        ((Moto)obj).idMoto = idMoto;
    }
}
