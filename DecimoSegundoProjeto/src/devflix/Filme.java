package devflix;

public class Filme extends Video{
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "português";
        this.legenda = "nenhuma";
    }
    
    @Override // fez uma sobrescrita do método da classe Video.java
    public void play() { // o java entende que play()
        System.out.println("Play: filme " + getNome()); 
    }

    public void play(String audio){ // o java entende que play(String)
        this.audio = audio;
        if (audio == "português"){
            this.legenda = "nenhuma";
        } else {
            this.legenda = "português";
        }
         System.out.println("Play: " + toString());
    }

    public void play(String audio, String legenda){ // o java entende que play(String,String)
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: " + toString());
    }

    /* 
    public void play(String legenda, String qualidade){ // o java dá erro nessa criação de método, pois existe já outro método com play(String,String)
    }
    */

    @Override
    public String toString() {
        String informacao = String.format("Filme %s (audio %s, legenda %s)", getNome(), audio, legenda);
        return informacao;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
 
    
}
