public class CuentaUsuario {

    String CorreoElectronico;
    int MesesActico;
    Subscripcion subscripcion;

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
}
