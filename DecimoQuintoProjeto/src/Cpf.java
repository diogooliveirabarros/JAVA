public class Cpf {
    private static final int INDICE_REGIAO_CPF = 8; 
    private static final int INDICE_PRIMEIRO_VERIFICADOR = 9;
    private static final int INDICE_SEGUNDO_VERIFICADOR = 10;

    public void validar(String cpf){
        // ABC.DEF.GHI-JK
        // A-H: é um identificador que a RF
        // I: é a região onde foi emitido o seu CPF
        // J(9): digitos verificadores
        // K(10): digitos verificadores

        int regiao = cpf.charAt(INDICE_REGIAO_CPF);
        int primeiroDigitoVerificador = cpf.charAt(INDICE_PRIMEIRO_VERIFICADOR);
        int segundoDigitoVerificador = cpf.charAt(INDICE_SEGUNDO_VERIFICADOR);
}
