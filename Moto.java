public class Moto extends Veiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindrada, String placa) {
        super(marca, modelo, anoFabricacao, placa);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nCilindrada: " + cilindrada;  
    }
}

