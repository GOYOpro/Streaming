public class PlanPremium implements Subscripcion {
    @Override
    public double costoSubscripcion(int mes) {
        return mes * 14;
    }
}
