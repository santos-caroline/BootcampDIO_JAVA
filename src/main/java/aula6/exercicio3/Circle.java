package aula6.exercicio3;
// Math.PI pertence ao pacote java.lang, que é importado automaticamente pelo Java.

public record Circle(double radius) implements GeometricForm {

    private static double pi = Math.PI;

    @Override
    public double getArea() {
        return pi * (radius * radius);
    }
}
