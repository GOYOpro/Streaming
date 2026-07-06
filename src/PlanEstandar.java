public class PlanEstandar implements Subscripcion {
    @Override
    public double costoSubscripcion(int mes) {
        return mes * 9;
    }
}
