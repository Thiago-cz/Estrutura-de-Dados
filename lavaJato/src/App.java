
public class App {

        public static void main(String[] args) {
                Fila fila = new Fila();

                Carro veic1 = new Carro();
                Carro veic2 = new Carro();
                Carro veic3 = new Carro();
                Carro veic4 = new Carro();
                Carro veic5 = new Carro();

                veic1.cadCarro(veic1, "Gol", "Volkswagen", "Fernando Davila", 10001);
                veic2.cadCarro(veic2, "Palio", "Fiat", "Jose Batista", 10002);
                veic3.cadCarro(veic3, "S10", "Chevrolet", "Alberto Silva", 10003);
                veic4.cadCarro(veic4, "Uno", "Fiat", "Bruno Jorge", 10004);
                veic5.cadCarro(veic5, "Model-1", "Tesla", "Elon Musk", 10005);

                Caminhao veic6 = new Caminhao();
                Caminhao veic7 = new Caminhao();
                Caminhao veic8 = new Caminhao();
                Caminhao veic9 = new Caminhao();
                Caminhao veic10 = new Caminhao();

                veic6.cadCaminhao(veic6, "AXOR", "Mercedez", "Rafael Borges", 10006);
                veic7.cadCaminhao(veic7, "Atego", "Mercedez", "Paulo Goncalves", 10007);
                veic8.cadCaminhao(veic8, "Volvo FH", "Volvo", "Roberto Castro", 10008);
                veic9.cadCaminhao(veic9, "Adventador", "Lamborghini", "Luciano Hulk", 10009);
                veic10.cadCaminhao(veic10, "Voyage", "Volkswagen", "Maicon Ferreira", 10010);

                Moto veic11 = new Moto();
                Moto veic12 = new Moto();
                Moto veic13 = new Moto();
                Moto veic14 = new Moto();
                Moto veic15 = new Moto();

                veic11.cadMoto(veic11, "Titan", "Honda", "Pedro Alvares", 10011);
                veic12.cadMoto(veic12, "Twister", "Honda", "Marcos Vinicius", 10012);
                veic13.cadMoto(veic13, "Neo", "Yamaha", "Joao Italo", 10013);
                veic14.cadMoto(veic14, "XJ-6", "Yamaha", "Luiz Claudio", 10014);
                veic15.cadMoto(veic15, "Bros", "Honda", "Diego Antunes", 10015);

                fila.listaObj(veic1);
                fila.listaObj(veic2);
                fila.listaObj(veic3);
                fila.listaObj(veic4);
                fila.listaObj(veic5);
                fila.listaObj(veic6);
                fila.listaObj(veic7);
                fila.listaObj(veic8);
                fila.listaObj(veic9);
                fila.listaObj(veic10);
                fila.listaObj(veic11);
                fila.listaObj(veic12);
                fila.listaObj(veic13);
                fila.listaObj(veic14);
                fila.listaObj(veic15);

                Object cadObj = new Object();

                for (int i=0; i<14; i++) {
                        cadObj = fila.listObj.get(i);
                        System.out.println("\nOrdem da fila para Lavar! " + fila.filaLavar.size());
                        if ((i > 1) && (i % 3 == 0)) {
                                fila.inserirLavado(fila.filaLavar.get(fila.filaLavar.size()-1));
                                fila.remove();
                                System.out.println("\nCarro removido da fila!");
                                fila.imprimir(cadObj);
                        } else {
                                if (fila.elemRepet(cadObj) == true) {
                                        System.out.println(
                                                        "\nNao eh possivel cadastrar pois esse veiculo ja foi cadastrado");
                                } else {
                                        fila.inserirLavar(cadObj);
                                        System.out.println("\nVeiculo cadastrado!");
                                }

                        }
                }     
        }

}
