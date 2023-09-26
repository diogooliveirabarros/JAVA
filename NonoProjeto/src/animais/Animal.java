package animais;

public class Animal {
    private String nome;

    public Animal(String nome){ // construtor
        this.nome = nome;
    }

    public void comer(){
        System.out.printf("%s comeu \n", nome); // o printf significa o format
    }

    public void beber(){
        System.out.printf("%s comeu \n", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
