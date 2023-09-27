package jogo;

public final class Arqueiro extends Personagem{ // com o modificador sem acesso 'final', impede que outras classes herdem da classe Arqueiro
    private String arma;

    public Arqueiro(String nome) {
        super(nome); // super representa o construtor da classe pai Personagem
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString(){
        String informacaoPersonagem = super.toString(); // Chama o método superior(super) toString da classe pai Personagem, e aloca na variável informacaoPersonagem na classe Arqueiro
        String informacaoArqueiro = String.format(" - Arma: %s", arma); // só inclui o atributo arma do arqueiro na variável informacaoArqueiro
        String resultado = informacaoPersonagem + informacaoArqueiro; // junta duas String que seria a informacaoPersonagem que pegou a toString da classe Personagem, com a informacaoArqueiro criada aqui 
        return resultado;
    }

    @Override
    public void atacar() { 
        System.out.println("O arqueiro atacou com " + arma); // é obrigado a usar o método abstrato atacarComArma da classe pai Personagem
    }

    
}
