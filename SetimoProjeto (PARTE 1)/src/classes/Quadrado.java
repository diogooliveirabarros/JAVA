package classes;

public class Quadrado implements FiguraGeometrica { // Obriga a classe Quadrado a ter o método da Interface Figura Geometrica.java
    // Atributos
    private int lado;
    
    // Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }

    // Métodos específicos da classe
    public double calcularArea(){ // Método que está na Interface FiguraGeometrica.java, É OBRIGATÓRIO!
        return Math.pow(lado, 2);
    }

    // Métodos getters e setters
     public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
