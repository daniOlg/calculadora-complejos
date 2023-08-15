package interfaz;

import numeros.Complejo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {
    final int SUMAR = 1, RESTAR = 2, MULTIPLICAR = 3, DIVIDIR = 4;

    public void Interfaz() {}

    public void iniciarInterfaz() {
        // disclaimer
        System.out.println("*** AVISO ***");
        System.out.println("Dependiendo de su sistema puede que el separador de decimales sea una coma o un punto!!");

        Scanner scanner = new Scanner(System.in);

        // loop infinito hasta que el usuario dicte lo contrario
        while (true) {
            // imprimir opciones
            System.out.println("\n-+-+-+ CALCULADORA DE NUMEROS COMPLEJOS +-+-+-");
            System.out.println("\t\t\tIngrese una operacion:");
            System.out.print("[1.Sumar] ");
            System.out.print(" [2.Restar] ");
            System.out.print(" [3.Multiplicar] ");
            System.out.println(" [4.Dividir] ");
            System.out.println("\t\t\t\t[0.Salir]");

            System.out.print("\nOpcion: ");

            // traer opcion del usuario
            int opcion;
            try {
                // leer la opcion del usuario
                opcion = scanner.nextInt();

                // si no es una de las opciones
                if(opcion < 0 || opcion > 4)
                    throw new InputMismatchException();

            } catch (InputMismatchException e) {
                System.out.println("** Opcion invalida: Debe ingresar un numero del listado **");

                scanner.nextLine(); // invalidar salto de linea

                continue;
            }

            // se ejecuta la operacion elegida
            switch (opcion) {
                case SUMAR -> sumar();
                case RESTAR -> restar();
                case MULTIPLICAR -> multiplicar();
                case DIVIDIR -> dividir();
                default -> salir();
            }
        }
    }

    void sumar() {
        Complejo complejo1 = consultarComplejo(1);
        Complejo complejo2 = consultarComplejo(2);

        System.out.println("\nSu resultado es:");
        System.out.println(complejo1 + " + " + complejo2 + " = " + complejo1.sumar(complejo2));
    }

    void restar() {
        Complejo complejo1 = consultarComplejo(1);
        Complejo complejo2 = consultarComplejo(2);

        System.out.println("\nSu resultado es:");
        System.out.println(complejo1 + " - " + complejo2 + " = " + complejo1.restar(complejo2));
    }

    void multiplicar() {
        Complejo complejo1 = consultarComplejo(1);
        Complejo complejo2 = consultarComplejo(2);

        System.out.println("\nSu resultado es:");
        System.out.println(complejo1 + " * " + complejo2 + " = " + complejo1.multiplicar(complejo2));
    }

    void dividir() {
        Complejo complejo1 = consultarComplejo(1);
        Complejo complejo2 = consultarComplejo(2);

        System.out.println("\nSu resultado es:");
        System.out.println(complejo1 + " / " + complejo2 + " = " + complejo1.dividir(complejo2));
    }

    void salir() {
        System.exit(0);
    }

    // consulta el real e imaginario de un complejo
    private Complejo consultarComplejo(int contador) {
        System.out.println("\nComplejo #" + contador + ":");

        double real = consultarNumero("real");
        double imaginario = consultarNumero("imaginario");

        return new Complejo(real, imaginario);
    }

    // consulta un numero double comprobando excepciones
    private double consultarNumero(String tipo) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        while (true) {
            try {
                System.out.print("- Ingrese el numero "+tipo+": ");
                numero = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n** Debe ingresar un numero "+tipo+" valido **\n");
                scanner.nextLine(); // invalidar salto de linea
            }
        }

        return numero;
    }
}
