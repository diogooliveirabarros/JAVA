import javax.swing.JOptionPane;

import classes.Personagem;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       // Pessoa pessoa = new Pessoa("João II", 7, 1.50f);

       String nome = JOptionPane.showInputDialog(null, "Nome do Personagem");
       String classe = JOptionPane.showInputDialog(null, "Classe do personagem");
       
       Personagem guerreiro = new Personagem(nome, classe);

    }
}
