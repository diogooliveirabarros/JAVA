import festas.FestaVip;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
        private (privado em uma classe específica, os atributos só serão visíveis por meio de um método público)
        public (público em todas as pastas)
        protected (é usado na herança)
        default -> package private -> pacote privado (quando não coloca nada, é visível apenas na pasta 'package' em que está inserido)
        */

        /* 
        FestaVip festa = new FestaVip();
        festa.quantidadeCafe = 20;
        festa.entrar();
        */

        ContaNetflix conta = new ContaNetflix();

        conta.entrar();
        conta.assistirFilme("Venom 2");
    }
}
