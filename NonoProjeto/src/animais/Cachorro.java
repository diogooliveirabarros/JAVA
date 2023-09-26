package animais;

public class Cachorro extends Animal {
    public Cachorro(String nome){ // construtor
        super(nome); // usou super para acessar o construtor da classe principal Animal e passar o parâmetro para ela, precisa o super ser a primeira linha do construtor
    }
    
    public void latir (){
        System.out.printf("%s latiu \n", getNome());
    }

    public void lamber(){
        System.out.printf("%s lambeu \n", getNome());
    }
}
