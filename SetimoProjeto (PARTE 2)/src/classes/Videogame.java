package classes;

public class Videogame {
    private boolean estaLigado; // false
    private Jogo jogo;

    public void ligar(){
        System.out.println("Ligando videogame...");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo){
        if (estaLigado == true){
            System.out.println("Iniciando o jogo...");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("Videogame está desligado!");
        }
    }

    public void fechar(){
        if (estaLigado == true){
            System.out.println("Fechando o jogo...");
            if (jogo != null){
                jogo.fechar();
                jogo = null; // estou definindo o valor de null que significa que não está rodando
            } else {
                System.out.println("Não tem nenhum jogo rodando!");
            }
        } else {
            System.out.println("Videogame está desligado!");
        }    
    }
}
