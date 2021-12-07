package br.com.elder;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String inscricaoEstadual;

    public PessoaJuridica(String nome) {
        super(nome);
    }
}
