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
        int opcion = 0, meses = 0;
        String opcion2 = "", correo = "";
        miMetodo.AgregarUsuarios(new CuentaUsuario("David@783", 7, new PlanBasico()));

        miMetodo.AgregarUsuarios(new CuentaUsuario("Jesus@9384", 5, new PlanEstandar()));

        miMetodo.AgregarUsuarios(new CuentaUsuario("Adrian@", 5, new PlanPremium()));

        miMetodo.Reporte();


    }
}