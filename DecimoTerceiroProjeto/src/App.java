import telefone.Contato;
import telefone.Contatos;
import telefone.Ligacao;
import telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("4002 8922");
    
        Contato contatoA = new Contato("Lucas", "40897456");
        Contato contatoB = new Contato("Luan", "123456");
        Contato contatoC = new Contato("Maria", "789468");
        Contato contatoD = new Contato("Lorrainne", "7889978");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);
        System.out.println(telefoneContatos);

        System.out.println("Contatos filtrados:");
        System.out.println(telefoneContatos.buscar("l"));

        Ligacao ligacao = new Ligacao("123", "456");
        ligacao.ligar();
        System.out.println(ligacao);
    }
}
