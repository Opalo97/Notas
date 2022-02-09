package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroDeNotas, aprobados = 0, suspensos = 0;
        float nota, media, suma = 0f;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas notas quieres introducir? ");
        numeroDeNotas = entrada.nextInt();

        for (int i = 0; i < numeroDeNotas; i++) {
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = entrada.nextInt();
            } while (nota < 0 || nota > 10);

            suma += nota;

            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println();

        System.out.println("Número de aprbados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);

        media = suma / (float)numeroDeNotas;
        System.out.println("Media de notas: "+ media);

        entrada.close();
    }
}
