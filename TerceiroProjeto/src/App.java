import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;
/*import videos.Documentario; importa um por um
import videos.Filme;
import videos.Novela;
import videos.Serie;
*/
public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme();

        Novela novela = new Novela();

        Documentario documentario = new Documentario();

        Serie serie = new Serie();

        Janela janelinha = new Janela();

        MiniaturaVideo miniatura = new MiniaturaVideo();

        BotaoPlay botaoplay = new BotaoPlay(); 
    }
}
