public class Main {
    public static void main(String[] args) {
        CalculoMedia calculo = new Geometrica();  // Alternar entre Aritmetica e Geometrica

        Disciplina d = new Disciplina(calculo);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();

        System.out.printf("P1:%.2f P2:%.2f Media:%.2f Situacao: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}