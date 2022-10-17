
public class Caminhao {
    String modelo, marca, cor, dono; 
    int idCaminhao;

    void cadCaminhao(Object obj, String modelo, String marca, String dono, int idCaminhao){
        ((Caminhao)obj).modelo = modelo;
        ((Caminhao)obj).marca = marca;
        ((Caminhao)obj).dono = dono;
        ((Caminhao)obj).idCaminhao = idCaminhao;
    }

}
