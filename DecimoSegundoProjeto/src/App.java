import devflix.Filme;
import devflix.Serie;
import devflix.Video;

public class App {
    public static void main(String[] args) throws Exception {

        // Polimorfismo
        // Poli -> muitas
        // morfo -> múltiplas formas

        // Permite que o mesmo nome, represente vários comportamentos diferentes
        // O método play() que está na classe Video e também na classe Filme, tem comportamentos diferentes
    
        /* EXEMPLO 01 DE POLIMORFISMO (SOBRESCRITA)
        
        Filme filme = new Filme("Lagoa Azul");
        filme.play();

        Video video = new Video("teste");
        video.play();

        */

        // Permita que você tenha o mesmo método, só que eles tem comportamentos diferentes

        // EXEMPLO 02 DE POLIMORFISMO (SOBRECARGA)
        Filme filme = new Filme("Lagoa Azul");
        filme.play(); // esse não precisa de parâmetro
        filme.play("japonês"); // esse precisa de parâmetro
        filme.play("inglês", "árabe");

        Serie serie = new Serie ("The Last of US", 2 , 10);
        serie.play(2, 8);
    }
}
