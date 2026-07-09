//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main
{
    static void main()
    {



        PlataformaStreaming miMetodo = new PlataformaStreaming();
        Scanner sc = new Scanner(System.in);
        CuentaUsuario cuentaUsuario;
        Subscripcion subscripcionElegida = null;
        int opcion = 0, meses = 0,plan= 0;
        String correo = "";

        miMetodo.AgregarUsuarios(new CuentaUsuario("Jesus@",4,new PlanEstandar()));
        try {
            do {
                System.out.println("1.Crear cuenta");
                System.out.println("2.Usuarios existentes");
                System.out.println("3.Reporte");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion){
                    case 1:
                        System.out.println("========DATOS PARA INGRESAR DEL USUARIO=======");
                        System.out.println("Ingrese un correo");
                        correo = sc.nextLine();

                        System.out.println("Selecciona el tipo de subcripcion");
                        System.out.println("1.Plan Basico");
                        System.out.println("2.Plan Estandar");
                        System.out.println("3.Plan Premium");
                        plan = sc.nextInt();

                        System.out.println("Igrese los meses activo");
                        meses = sc.nextInt();
                        sc.nextLine();

                        switch (plan){
                            case 1:
                                subscripcionElegida  = new PlanBasico();
                                break;
                            case 2:
                                subscripcionElegida = new PlanEstandar();
                                break;
                            case 3:
                                subscripcionElegida = new PlanPremium();
                                break;
                            default:
                        }

                        cuentaUsuario = new CuentaUsuario(correo,meses,subscripcionElegida);
                        miMetodo.usuarios.add(cuentaUsuario);
                        break;
                    case 2:
                        System.out.println("========USUARIOS EN EL SISTMA=========");
                        for (CuentaUsuario user : miMetodo.usuarios){
                            System.out.println(user.getCorreoElectronico());
                        }
                        break;
                    case 3:
                        System.out.println("==========REPORTE DE INGRESOS============");
                        miMetodo.Reporte();
                        break;

                }
            }while (opcion != 3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}