public abstract class PlanPremium implements Subscripcion {
    @Override
    public String toString() {
        return "PlanPremium{}";
    }
    public double calcular(int meses) {
        return (meses * 14.00)+3.00;

    }
}
