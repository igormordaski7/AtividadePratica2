import java.util.ArrayList;
import java.util.List;

public class CadastroVeiculo {
    
    private static List<Veiculo> cadasVeiculo = new ArrayList<>();

    public static void cadastrarVeiculo (Veiculo x) {
       cadasVeiculo.add(x);
    }

    public static List<Veiculo> getListaVeiculos () {
        return cadasVeiculo;
    }

    public static boolean buscarVeiculo(String placa) {
        for (Veiculo buscVeiculo : cadasVeiculo) {
            if (buscVeiculo.getPlaca().equals(placa)) {
                System.out.println(buscVeiculo.toString()); 

            return true;
        }   
    }
        return false;
    }

    public static boolean excluirVeiculo (String placa){

        for (int i = 0; i < cadasVeiculo.size(); i++) {
            if(cadasVeiculo.get(i).getPlaca().equals(placa)) {
                cadasVeiculo.remove(i);
                return true;
            }
        }
            return false;
    }

    public static boolean editarVeiculo (String placa,String newMarca, String newModelo, int newAnoFabri, String newPlaca, String newTipoTrans, int newCilindrada, double newCargaMax) {

        if (cadasVeiculo.size() != 0) {
            
            for (Veiculo veiculo : cadasVeiculo) {
                if (veiculo.getPlaca().equals(placa)) {
                  
                    if ((veiculo instanceof Carro && newTipoTrans != null) ||
                    (veiculo instanceof Moto && newCilindrada != 0) ||
                    (veiculo instanceof Caminhao && newCargaMax != 0)) {
                    veiculo.setMarca(newMarca);
                    veiculo.setModelo(newModelo);
                    veiculo.setAnoFabricacao(newAnoFabri);
                    veiculo.setPlaca(newPlaca);
                    
                    if (veiculo instanceof Carro) {
                        Carro carro = (Carro) veiculo;
                        carro.setTipoTransmissao(newTipoTrans);
                    }
                    
                    else if (veiculo instanceof Moto) {
                        Moto moto = (Moto) veiculo;
                        moto.setCilindrada(newCilindrada);
                    }
                    
                    else if (veiculo instanceof Caminhao) {
                        Caminhao caminhao = (Caminhao) veiculo;
                        caminhao.setCargaMax(newCargaMax);
                    }
                    return true;
                }else {
                    return false;
                }
            }
        }
     }
        return false;
    }

    public static boolean verificaPlaCate(int categoria, String placa) { // Método para funcionar o editarVeiculo
        for (Veiculo veiculo : cadasVeiculo) {
            if (veiculo.getPlaca().equals(placa)) {
                if ((categoria == 1 && veiculo instanceof Carro) ||
                    (categoria == 2 && veiculo instanceof Moto) ||
                    (categoria == 3 && veiculo instanceof Caminhao)) {
                    return true; 
                } else {
                    return false;
                }
            }
        }
        return false; 
    }

    public static boolean listVazia() { // Método para funcionar o editarVeiculo
        return cadasVeiculo.isEmpty();
    }

    public static boolean listarVeiculo() {
        if (cadasVeiculo.size() != 0) {
            for (Veiculo temp : cadasVeiculo) {
                System.out.println(temp);
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean excluirLista() {
        for (Veiculo veiculo : cadasVeiculo) {
        cadasVeiculo.clear();
        return true;
    }
        return false;
    }

}
            



