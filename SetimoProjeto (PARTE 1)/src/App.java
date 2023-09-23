import classes.CalculadorArea;
import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        // Encapsulamento -> Interface
        Circulo circulo = new Circulo(2);
        Quadrado quadrado = new Quadrado(5);

        CalculadorArea calculador = new CalculadorArea();
        System.out.println(calculador.somarAreas(quadrado,circulo));
    }
}
