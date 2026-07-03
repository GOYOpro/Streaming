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
        int Total = 0;
        String PlanU;

        for(CuentaUsuario usuario : usuarios){
           double costoMes = usuario.CostoMES();
            Total += costoMes;

            System.out.println("Plan: " + PlanEstandar.class.getSimpleName());
            System.out.println("Plan: " + PlanPremium.class.getSimpleName());
        }
        System.out.println("Ingreso total de los usuarios: " + Total);
    }

}
