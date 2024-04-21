public class Veiculo {
    
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String placa;

    public Veiculo () {}
    
    public Veiculo(String marca, String modelo, int anoFabricacao, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    @Override
    public String toString() {
        
        return "\nMarca: " + marca +
        "\nModelo: " + modelo +
        "\nAno de fabricação: " + anoFabricacao +
        "\nPlaca: " + placa;
    } 
}
