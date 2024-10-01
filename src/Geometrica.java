public class Geometrica implements CalculoMedia {
    @Override
    public double calcular(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public boolean isAprovado(double media) {
        return media > 7.0;
    }
}