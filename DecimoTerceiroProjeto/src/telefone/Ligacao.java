package telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    private String numero;
    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;

    public Ligacao(String numero, String numeroDestino) {
        this.numero = numero;
        this.numeroDestino = numeroDestino;
    }

    public void ligar(){
        System.out.println("Ligando para " + numeroDestino);
        System.out.println("Chamando...");
        System.out.println("O número está ocupado");
        // dia/mês/ano horas:minutos:ss
        // dd/MM/YYYY HH:mm:ss
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("");
        LocalDateTime horarioAgora = LocalDateTime.now();
        horarioLigacao = formatadorData.format(horarioAgora);
    }

    @Override
    public String toString() {
       String informacao = String.format("Origem: %s\tDestino: %s\tHorário: %s", numeroOrigem, numeroDestino, horarioLigacao);
       return informacao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    
}
