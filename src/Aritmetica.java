public class Aritmetica implements CalculoMedia {
    @Override
    public double calcular(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public boolean isAprovado(double media) {
        return media > 5.0;
    }
}