package br.com.elder;

public class Carro extends Veiculo{

    private int qtdPortas;

    public Carro(String marca, int qtdPortas) {
        super(marca);
        this.qtdPortas = qtdPortas;
    }
}
