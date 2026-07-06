public class PlanBasico implements Subscripcion {
    @Override
    public double costoSubscripcion(int mes) {
        return mes * 4;
    }
}
