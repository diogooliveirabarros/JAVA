import classes.PingPong;
import classes.Videogame;
import classes.Xadrez;

public class App {
    public static void main(String[] args) throws Exception {
        // Encapsulamento -> Interface
        // PingPong pingpong = new PingPong();
        Videogame xDevOne = new Videogame();
        xDevOne.ligar();
        xDevOne.jogar(new Xadrez());
        xDevOne.fechar();
    }
}
