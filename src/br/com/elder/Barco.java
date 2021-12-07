package br.com.elder;

public class Barco extends Veiculo{

    private int porMotor;

    public Barco(String marca, int porMotor) {
        super(marca);
        this.porMotor = porMotor;
    }
}
