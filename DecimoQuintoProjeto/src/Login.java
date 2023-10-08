public class Login {
    // static
    // nome em um padrãp snake case
    // final

    private static final int TAMANHAO_MINIMO_SENHA = 7; // com atributo static eu consigo acessar de fora diretamente Login.tamanhoMinimoSenha, sem criar nenhum objeto

    // PORTUGUÊS: VERIFICAR SENHA
    // CAME CASE: verificarSenha
    // SNAKE CASE: VERIFICAR_SENHA

    public void verificarSenha(String senha){
        if(senha.length() >= TAMANHAO_MINIMO_SENHA){
            System.out.println("Senha válida");
        }else{
            System.out.println("Senha inválida");
        }
    }
}
