package br.edu.ifg;
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String sexo;
    private String indentificadorDoVoo;

    public Pessoa(String nome, String cpf, String sexo, String indentificadorDoVoo){
        this.nome=nome;
        this.cpf=cpf;
        this.sexo= sexo;
        this.indentificadorDoVoo=indentificadorDoVoo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getindentificadorDoVoo() {
        return indentificadorDoVoo;
    }
    public void setindentificadorDoVoo(String indentificadorDoVoo) {
        this.indentificadorDoVoo = indentificadorDoVoo;
    }
    
}
