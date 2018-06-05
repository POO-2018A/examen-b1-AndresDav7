package examenb1;

import java.util.Scanner;

public class ExamenB1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Libro[] libro = new Libro[10];
        Autor[] autor = new Autor[10];

        int opcionMenu = 0;
        int numLibro = 0;
        int numArtista = 0;

        while (opcionMenu != 4) {

            System.out.println("\n *** Biblioteca personal ***");
            System.out.println("1.Ingrese nuevo libro");
            System.out.println("2.Imprimir listado favoritos");
            System.out.println("3.Libros de Autor");
            System.out.println("4.Salir");
            System.out.print("Ingrese Opcion : ");
            opcionMenu = scan.nextInt();

            switch (opcionMenu) {
                case 1:

                    if (numLibro == 10) {

                        System.out.println("Su biblioteca ya esta llena, no puede"
                                + " ingresar mas libros !!");

                    } else {
                        scan.nextLine();
                        System.out.print("Ingrese el Titulo:");
                        String titulo = scan.nextLine();

                        System.out.println("Ingrese el Autor");

                        System.out.print("Nombre: ");
                        String nombre = scan.nextLine();
                        System.out.print("Pais: ");
                        String pais = scan.nextLine();

                        System.out.print("Ingrese el Año:");
                        int anio = scan.nextInt();

                        autor[numArtista] = new Autor(nombre, pais);
                        libro[numLibro] = new Libro(titulo, autor, anio);
                        numArtista++;
                        numLibro++;
                    }
                    break;

                case 2:
                    for (int i = 0; i < numLibro; i++) {
                        System.out.print(" ♦ Libro Numero " + (i + 1));
                        System.out.println(autor[i] + "" + libro[i] + "\n");
                    }

                    break;

                case 3:

                    int Listado = 0,
                     cantLibro = 1;

                    for (int j = 0; j < numArtista; j++) {
                        for (int i = 0; i < numArtista; i++) {
                            if (i != j && autor[j].getNombre().equals(autor[i].getNombre())) {
                                cantLibro++;
                            } else {
                                Listado++;
                            }
                        }
                        System.out.println((Listado) + ". " + autor[j].getNombre() + "Num : " + cantLibro);
                        cantLibro = 1;
                    }
                    
                    break;

                case 4:

                    System.out.println("\nEsta seguro de que desea Salir ?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Ingrese Opcion = ");
                    int opcSalir = scan.nextInt();
                    if (opcSalir == 1) {
                        break;
                    } else {
                        opcionMenu = 0;
                    }

                    break;

                default:
                    System.out.println("Opcion no valida !");
                    break;
            }

        }
    }
}
