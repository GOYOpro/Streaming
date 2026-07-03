public abstract class PlanBasico implements Subscripcion {
    public double calcular(int meses) {
        return meses * 2.00;
    }

    @Override
    public String toString() {
        return "PlanBasico{}";
    }
}

