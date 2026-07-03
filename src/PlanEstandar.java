public abstract class PlanEstandar implements Subscripcion {
    public double calcular(int meses) {
        return meses * 9.00;
    }

    @Override
    public String toString() {
        return "PlanEstandar{}";
    }
}
