import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        // modificar -> setNomeVariavel
        // pegar -> getNomeVariavel

        pessoa.setNome("Bob Esponja");
        pessoa.setAltura(1.9);
        pessoa.setIdade(20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getIdade());
    }
}
