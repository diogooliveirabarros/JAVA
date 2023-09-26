package animais;
public class Gato extends Animal {
    public Gato(String nome){ // construtor
        super(nome); // usou super para acessar o construtor da classe principal Animal e passar o parâmetro para ela, precisa o super ser a primeira linha do construtor
    }
    
    public void miar(){
        System.out.printf("%s miou \n", getNome());
    }
}
