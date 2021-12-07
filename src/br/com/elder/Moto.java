package br.com.elder;

public class Moto extends Veiculo{

    private int qtdCilindradas;

    public Moto(String marca, int qtdCilindradas) {
        super(marca);
        this.qtdCilindradas = qtdCilindradas;
    }

    public int getQtdCilindradas() {
        return qtdCilindradas;
    }

    public void setQtdCilindradas(int qtdCilindradas) {
        this.qtdCilindradas = qtdCilindradas;
    }

    @Override
    public String getMarca() {
        String marcaMoto = super.getMarca() + " Exemplo";
        return marcaMoto;
    }



}
