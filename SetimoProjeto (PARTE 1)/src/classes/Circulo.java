package classes;

public class Circulo implements FiguraGeometrica { // Obriga a classe Circulo a ter o método da Interface Figura Geometrica.java
    // Atributos
    private int raio;

    // Construtor
    public Circulo(int raio){
        this.raio = raio;
    }

    // Métodos específicos da classe
    public double calcularArea(){ // Método que está na Interface FiguraGeometrica.java, É OBRIGATÓRIO!
        // area = PI * raio ^ 2
        return Math.PI * Math.pow(raio, 2);
    }

    // Métodos getters e setters
     public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
