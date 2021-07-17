package pruebafiguras.modelo;

public abstract class Triangulo implements Figura {
    
    private double lado1, lado2, angulo;
    private String nombre;

    public Triangulo(double lado1, double lado2, double angulo, String nombre) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.angulo = angulo;
        this.nombre = nombre;
    }        

    @Override
    public String getNombre() {
       return nombre;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2 / 2; //se asume triángulo rectángulo con lado1 = base, lado2= altura
    }

    @Override
    public double calcularPerimetro() {
        double hip = Math.sqrt(lado1*lado1 + lado2*lado2);
        return hip + lado1 + lado2;
    }

    @Override
    public abstract void dibujarTxt();

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    
    
    
}
