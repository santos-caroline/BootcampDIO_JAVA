package aula6.exercicio3;

public record Rectangle(double height, double base) implements GeometricForm {
    @Override
    public double getArea() {
        return base * height;
    }
}
