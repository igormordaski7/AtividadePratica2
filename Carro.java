public class Carro extends Veiculo {

    private String tipoTransmissao;

    public Carro(String marca, String modelo, int anoFabricacao, String tipoTransmissao) {
        super(marca, modelo, anoFabricacao);
        this.tipoTransmissao = tipoTransmissao;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nTipo de Transmissão: " + tipoTransmissao;
    }

    
    
}
