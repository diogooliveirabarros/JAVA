package classes;

public class CalculadorArea {
    /*
        Quadrado, Circulo
        Circulo, Quadrado
        Circulo, Circulo
        Quadrado, Quadrado  
    */
    public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB){
        double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
        return totalArea;
    }
}
