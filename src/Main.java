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
        int opcion = 0, meses = 0;
        String correo = "";



        do
        {
            System.out.println("\n=============================================");
            System.out.println("     BASE DE DATOS - PLATAFORMA DE STREAMING     ");
            System.out.println("=============================================");

            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar reportes");

            if (opcion == 1)
            {
                System.out.println("\n=============================================");
                System.out.println("     REGISTRO USUARIOS     ");
                System.out.println("=============================================");

                // miMetodo.AgregarUsuarios();

            } else if (opcion == 2)
            {
                System.out.println("\n=============================================");
                System.out.println("     REGISTRO USUARIOS     ");
                System.out.println("=============================================");

                miMetodo.Reporte();
            }
        } while (true);


    }
}