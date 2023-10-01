package br.edu.ifg;
public class Aeromoca extends Pessoa{
    private boolean formacao;

    public Aeromoca(String nome, String cpf, String sexo, String indentificadorDoVoo, boolean formacao){
        super(nome, cpf, sexo, indentificadorDoVoo);
        this.formacao=formacao;
    }
    public boolean isFormacao() {
        return formacao;
    }

    public void setFormacao(boolean formacao) {
        this.formacao = formacao;
    }
    
}
