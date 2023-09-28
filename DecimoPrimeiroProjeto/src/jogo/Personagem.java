package jogo;
import java.util.Random;

public abstract class Personagem { 
    
    public abstract void atacar(){ // o abstract faz com que as classes que herdarem de Personagem implementem esse método atacar()

    }

    // protected serve para proteger métodos e variáveis que não estejam na classe ou não estejam herdando dela
    protected int rolarDado(){
        Random gerador = new Random();
        int numero = 1 + gerador.nextInt(6);
        return numero; 
    }
}
