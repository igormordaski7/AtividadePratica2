public class Caminhao extends Veiculo {

    private double cargaMax;

    public Caminhao(String marca, String modelo, int anoFabricacao, double cargaMax, String placa) {
        super(marca, modelo, anoFabricacao, placa);
        this.cargaMax = cargaMax;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nCarga Máxima: " + cargaMax;
    }
    
    
    
}

