package br.com.projeto1;

public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private String chassi;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroDePortas;
    private boolean temTetoSolar;
    private int numeroDeMarchas;
    private boolean temCambioAutomatico;
    private double volumeDeCombustivel;
    private Marca marca;
    private Proprietario proprietario;

    public Carro(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public boolean isTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public boolean isTemCambioAutomatico() {
        return temCambioAutomatico;
    }

    public void setTemCambioAutomatico(boolean temCambioAutomatico) {
        this.temCambioAutomatico = temCambioAutomatico;
    }

    public double getVolumeDeCombustivel() {
        return volumeDeCombustivel;
    }

    public void setVolumeDeCombustivel(double volumeDeCombustivel) {
        this.volumeDeCombustivel = volumeDeCombustivel;
    }

    public void acelera() {
        velocidadeAtual++;
    }

    public void freia() {
        velocidadeAtual = 0;
    }

    public void trocaMarcha() {
        numeroDeMarchas++;
    }

    public void reduzMarcha() {
        if (numeroDeMarchas > 0) {
            numeroDeMarchas--;
        }
        else {
            if (numeroDeMarchas == 0) {
               
                if (velocidadeAtual > 0) {
                    System.out.println("A marcha n�o pode ser engatada se o a velocidade for superior a 0 KM/h");
                    return;
                }

                numeroDeMarchas = -1;
            }
        }
    }

    /**
     * 17- Implemente um método que calcule a autonomia de viagem do veículo com base no
     * consumo médio passado como parâmetro;
     */
    public void calcularAutonomia(double consumoMedio) {

    }

  
    public void exibirVolumeCombustivel() {
        // volumeDeCombustivel
    }
}