package pruebafiguras.modelo;

public class Rectangulo implements Figura {

    private double base, altura;
    private String nombre;

    public Rectangulo(double base, double altura, String nombre) {
        this.altura = altura;
        this.base = base;
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return base * 2 + altura * 2;
    }

    @Override
    public void dibujarTxt() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
