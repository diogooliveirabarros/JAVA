public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("4002 8922");
    
        Contato contatoA = new Contato("Lucas", "40897456");
        Contato contatoB = new Contato("Luan", "123456");
        Contato contatoC = new Contato("Maria", "789468");

        telefone.getContatos().adicionar(contatoA);
        telefone.getContatos().adicionar(contatoB);
        telefone.getContatos().adicionar(contatoC);
        System.out.println(telefone.getContatos());
    }
}
