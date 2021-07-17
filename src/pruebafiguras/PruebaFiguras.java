package pruebafiguras;

import pruebafiguras.modelo.Cuadrado;
import pruebafiguras.modelo.Figura;
import pruebafiguras.modelo.Rectangulo;
import pruebafiguras.modelo.Triangulo;
import pruebafiguras.modelo.TrianguloRectangulo;

public class PruebaFiguras {

    public static void main(String[] args) {
//        Figura rectangulo = new Rectangulo(10, 15, "rectangulo");
//        System.out.println(rectangulo.getNombre());
//        rectangulo.dibujarTxt();
//        Figura cuadrado = new Cuadrado(10, "cuadrado");
//        System.out.println(cuadrado.getNombre());
//        cuadrado.dibujarTxt();
        Figura triangulo = new TrianguloRectangulo(10, 15, 45, "triangulo");
        triangulo.dibujarTxt();
        
    }
    
}
