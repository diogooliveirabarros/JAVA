package animais;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 10;
    }

    public void fazerPru(){
        System.out.printf("%s fez pruuuuuuuuuuuuuhhh \n", getNome());
    }

    public void enviarCarta(){
        System.out.printf("%s enviou uma carta \n", getNome());
        this.cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }   
}
