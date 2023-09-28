package devflix;

public class Serie extends Filme {
    private int temporadas;
    private int episodiosPorTemporada;
    private int episodioAtual;
    private int temporadaAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

// Os métodos específicos da classe
@Override
    public String toString() {
        String informacao = String.format("Série %s %dx%02d (audio %s, legenda %s)", getNome(), temporadaAtual, episodioAtual, getAudio(), getLegenda());
        return informacao;
    }

    /**
     * @param temporada
     * @param episodio
     */
    public void play(int temporada, int episodio) {
        if(validarEpisodio(temporada, episodio)){
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Episódio inválido!");
        }
    }

    private boolean validarEpisodio(int temporada, int episodio){
        if (temporada == 0 || episodio == 0)
            return false;

            if(temporada > temporadas || episodio > episodiosPorTemporada)
            return false;

         return true;
        } 

    


// Os métodos getters e setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }
}
