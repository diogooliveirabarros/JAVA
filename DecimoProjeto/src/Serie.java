public class Serie { // de forma implícita o java entende que a classe 'Serie' pertence a classe mãe do Java 'Object' (exemplo: public classe Serie extends Object), seria uma extensão.
    private String nome;
    private int temporadas;
    private int ano;

    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }

    // Métodos específicos
    
    /* Foi substituído por toString

    public String pegarInformacoes(){
        String informacoes = String.format("Nome: %s (%d) - %d temporada(s).", nome, ano, temporadas);
        return informacoes;
    }
    */

    @Override // o @Override significa uma sobescrita de métodos, ou seja o toString é um método implícito do java da classe mãe Object
    public String toString(){
        String informacoes = String.format("Nome: %s (%d) - %d temporada(s).", nome, ano, temporadas);
        return informacoes;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
