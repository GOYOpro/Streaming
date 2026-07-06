import java.security.PublicKey;
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
        System.out.println("Usuario registrado: " + usuario.getCorreoElectronico() + "|" +"Tipo de subscripcion: " + usuario.getSubscripcion().getClass().getSimpleName());
    }

    public void Reporte(){
        int Total = 0;
        for(CuentaUsuario usuario : usuarios){
           double costo = usuario.CostoMES();
            Total += costo;
        }
        System.out.println("Ingreso total de los usuarios: " + Total);
    }

    public void PlanMasSolicitado(){
        int PlanPremium = 0, PlanEstandar = 0, PlanBasico = 0;
        for (CuentaUsuario usuario : usuarios){
            PlanPremium++;
            PlanEstandar++;
            PlanBasico++;
            if (PlanBasico > PlanEstandar && PlanBasico > PlanPremium){
                System.out.println("El plan Basico es el mas solicitado por los usuarios");
            } else if (PlanEstandar > PlanBasico && PlanEstandar > PlanPremium) {
                System.out.println("El plan Estandar es mas soliitado por los usuarios");
            } else if (PlanPremium > PlanBasico && PlanPremium > PlanEstandar) {
                System.out.println("El plan Premium es mas soliitado por los usuarios");
            }
        }

    }

}
