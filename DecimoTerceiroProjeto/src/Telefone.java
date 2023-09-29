import java.util.ArrayList;

public class Telefone {
    private String numeroChip;
    private Contatos contatos;

    public Telefone(String numeroChip){
        this.numeroChip = numeroChip;
        this.contatos = new Contatos();
    }

    public Contatos getContatos() {
        return contatos;
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    
}
