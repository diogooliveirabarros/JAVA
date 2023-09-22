package classes;

public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;
    private float altura;

    // Método construtor serve para iniciar assim que é instanciado o objeto no App.java 
    // <modificador> <nome da classe>()
    public Pessoa(String nome, int idade, float altura){ // CONSTRUTOR
        System.out.println("Uma pessoa acaba de nascer! Parabéns!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

        imprimirDados();
    }

    private void imprimirDados(){ // MÉTODO PARA EXIBIR DADOS
        System.out.format("Nome: %s, idade %d anos e %.2f de altura", nome, idade, altura);
    }
    
    // Métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
