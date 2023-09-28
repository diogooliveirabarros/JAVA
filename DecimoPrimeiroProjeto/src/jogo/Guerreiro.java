package jogo;

public class Guerreiro extends Personagem{

    @Override
    public void atacar() {
        int valorDado6Faces = this.rolarDado();
        System.out.printf("Você tirou um %d no dado. ", valorDado6Faces);
        if (valorDado6Faces < 3){
            System.out.println("O guerreiro errou o ataque");
        } else if(valorDado6Faces == 6) {
            System.out.println("O guerreiro acertou um golpe especial");
        } else {
            System.out.println("O guerreiro acertou o inimigo!!!");
        }
    }
    
}
