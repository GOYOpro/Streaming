public class CuentaUsuario {

    private String CorreoElectronico;
    private int MesesActico;
    private Subscripcion subscripcion;

    public CuentaUsuario(String correoElectronico, int mesesActico, Subscripcion subscripcion) {
        CorreoElectronico = correoElectronico;
        MesesActico = mesesActico;
        this.subscripcion = subscripcion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public int getMesesActico() {
        return MesesActico;
    }

    public void setMesesActico(int mesesActico) {
        MesesActico = mesesActico;
    }

    public Subscripcion getSubscripcion() {
        return subscripcion;
    }

    public void setSubscripcion(Subscripcion subscripcion) {
        this.subscripcion = subscripcion;
    }

    public double CostoMES(){
        return this.subscripcion.costoSubscripcion(this.MesesActico);
    }
}


