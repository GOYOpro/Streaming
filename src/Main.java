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



        do
        {
            System.out.println("\n=============================================");
            System.out.println("     BASE DE DATOS - PLATAFORMA DE STREAMING     ");
            System.out.println("=============================================");

            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar reportes");

            if (opcion == 1)
            {
                do
                {
                    System.out.println("\n=============================================");
                    System.out.println("     REGISTRO USUARIOS     ");
                    System.out.println("=============================================");

                    // miMetodo.AgregarUsuarios();
                    System.out.print("¿Desea agregar otro usuario? (Y/N)... ");
                    opcion2 = sc.nextLine();

                }while (opcion2.equalsIgnoreCase("Y"));



            } else if (opcion == 2)
            {
                System.out.println("\n=============================================");
                System.out.println("     MOSTRAR REPORTES     ");
                System.out.println("=============================================");

                miMetodo.Reporte();
            }
        } while (true);


    }
}