package ada.viana.banco.model;

import java.time.LocalDate;

public class Pessoa {

    private LocalDate dataNascimento;
    private String cpf;
    private String telefone;
    private String nome;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {

        if(dataNascimento.isAfter(LocalDate.now()))
       {
           System.out.println("Data de nascimento invalida");
       }
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, String dataNascimento, String telefone) {
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) throws RuntimeException{
        if(cpf.length()!=11){
            throw new RuntimeException("Tamanho inválido de cpf");
        }
        this.cpf = cpf;
    }
    public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone){
        this.telefone = telefone;
    }




@Override
    public String toString() {
System.out.println("Nome "+ nome+ " Telefone "+ telefone );

    return null;
}
}