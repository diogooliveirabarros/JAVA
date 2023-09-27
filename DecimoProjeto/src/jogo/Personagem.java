package jogo;

/* private, public, protected -> modificadores de acesso
 * final, abstract -> modificadores sem acesso
 * 
 * FINAL: Usado nas 'classes' e 'métodos', ele impede que outras classes ou métodos usem e sobrescrevam as informações, deixando a classe que usar sendo a última.
 * 
 * ABSTRACT: Usado nas 'classes' e 'métodos', ele é usado como uma forma de abstração, ao declarar um método abstrato, é 'obrigado' que a classe também seja abstrata, e também é obrigado que as demais classes usem esse método como se fosse uma 'interface', o lado ruim que no App.java você não consegue instanciar um objeto daquela classe abstrata.
 */

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma"; //Arqueiro, guerreiro, mago
        this.nivel = 1;
    }

    @Override
    public String toString(){
        String informacoes = String.format("%s (nível: %d) - Classe: %s", nome, nivel, classe);
        return informacoes;
    }

    // <modificadorAcesso> <modificadorSemAcesso> <retornoMetodo> nomeDoMetodo()
    public final void atacarSemArma(){ // o modificador sem acesso 'final', impede que as classes filhas sobrescrevam ele 
        System.out.println("O personagem atacou sem arma");
    }

    // esse método foi sobrescrito na classe filha Arqueiro
    public void atacar(){ 
        System.out.println("O personagem atacou");
    }

    // public abstract void atacarComArma(); o método abstrato não pode conter um corpo(implementação), comentei pq se eu deixasse ativo a classe seria 'obrigada' a ser abstrata também, e com isso o objeto Personagem não seria instanciado na classe App.java

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
