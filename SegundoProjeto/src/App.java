public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();

        // chamei um método atacar e passei como argumento uma string "Hydra"
        heroi.atacar("Hydra", "Golpe Duplo");
    }
}
