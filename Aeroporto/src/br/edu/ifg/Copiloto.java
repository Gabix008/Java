package br.edu.ifg;
public class Copiloto extends Pessoa {
        private String licenca;

        public Copiloto (String nome, String cpf, String sexo, String indentificadorDoVoo, String licenca){
         super(nome, cpf, sexo, indentificadorDoVoo);
         this.licenca=licenca;
        }
    
        public String getLicenca() {
            return licenca;
        }
    
        public void setLicenca(String licenca) {
            this.licenca = licenca;
        }
    }

