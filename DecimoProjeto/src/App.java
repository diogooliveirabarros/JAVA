import jogo.Arqueiro;
import jogo.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem personagem = new Personagem("João");
        System.out.println(personagem);
        personagem.atacar();

        Arqueiro arqueiro = new Arqueiro("Legolas");
        System.out.println(arqueiro);
        arqueiro.atacar();
        arqueiro.atacarSemArma();


    /* INFORMAÇÕES PRIMEIRO EXEMPLO COM A CLASSE SERIE

        Serie serieQualquer = new Serie("The Last of US", 1, 2023);

      // Usando o toString não precisa declarar dessa forma System.out.println(serieQualquer.toString); apenas só com o nome do objeto serieQualquer
      // Usando o toString você chama o objeto no println, sem precisar tá chamando método
        System.out.println(serieQualquer); // forma implícita

    */

    }
}
