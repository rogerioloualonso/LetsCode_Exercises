package br.com.letscode.listas.lista4;

public class DadosIMC {

    private String nome;
    private float peso;
    private float altura;

    public DadosIMC(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "DadosIMC{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public float imc(){
        return this.peso / (this.altura * this.altura);
    }
}
