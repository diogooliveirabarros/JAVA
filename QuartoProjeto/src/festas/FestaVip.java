package festas;

public class FestaVip {
    
    //<modificador> <tipo> <nome atributo>
    private int quantidadeCafe = 30;
    private int quantidadeSalgados = 50;
    
    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    // <modificador> <retorno método> <nome método>
    private void beberCafe(){
        quantidadeCafe--; //quantidadeCafe = quantidadeCafe - 1;
        System.out.println("Bebeu 1 xícara de café");
    }

    void comerSalgado(){
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    }
}
