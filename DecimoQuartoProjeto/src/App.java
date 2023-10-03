public class App {
    public static void main(String[] args) throws Exception {
        // Modificador static
        // System.out.println(Matematica.somar(5, 10)); com o métodos static, você pode chamar o métodos inserindo o nome da classe.método

        Carro ferrari = new Carro("Ferrari", 2023);

        Carro fusca = new Carro("Fusca", 1999);

        ferrari.anoCompra = 2007;
        Carro.anoCompra = 2016;

        System.out.println(ferrari.getNome());
        System.out.println(Carro.anoCompra); // estão utilizando o mesmo atributo static anoCompra

        System.out.println(fusca.getNome());
        System.out.println(Carro.anoCompra); // estão utilizando o mesmo atributo static anoCompra
    }
}
