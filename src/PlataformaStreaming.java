import java.util.ArrayList;

public class PlataformaStreaming {
    ArrayList<CuentaUsuario> usuarios = new ArrayList<>();

    public PlataformaStreaming() {
        this.usuarios = usuarios;
    }

    public ArrayList<CuentaUsuario> getUsuarios() {
        return usuarios;
    }

    public void AgregarUsuarios(CuentaUsuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario registrado");
    }

    public void Reporte(){
    }

}
