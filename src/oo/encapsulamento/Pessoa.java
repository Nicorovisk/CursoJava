package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(int idade, String nome, String sobrenome){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade(){ //ler
        return idade;
    }

    public void setIdade(int novaIdade){ // alterar
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            idade = novaIdade;
        }

    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    public String toString() {
        return "Olá eu me chamo " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
    }
}
