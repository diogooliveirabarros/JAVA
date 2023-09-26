import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Caramelo");     
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Snowbell");
        gato.miar();

        Dragao dragao = new Dragao("Dragão branco de olhos azuis");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombo = new Pombo("Pombo correio sedex");
        pombo.voar();
        pombo.enviarCarta();
        pombo.fazerPru();
    }
}
