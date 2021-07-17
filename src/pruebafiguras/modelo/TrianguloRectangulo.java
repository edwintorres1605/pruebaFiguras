package pruebafiguras.modelo;

public class TrianguloRectangulo extends Triangulo {

    public TrianguloRectangulo(double lado1, double lado2, double angulo, String nombre) {
        super(lado1, lado2, angulo, nombre);
    }

    @Override
    public void dibujarTxt() {
        double base = super.getLado1();
        double altura = super.getLado2();
        for (int i = 0; i < altura; i++) {
            for (int j = i; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
