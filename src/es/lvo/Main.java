package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero,nota = 0,media;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas notas quieres introducir? ");
        numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {
            do {
                System.out.print("Nota " + (i + 1) + ":");
                nota = entrada.nextInt();
            } while (nota < 0 || nota > 10);
            System.out.println();
        }

        while (nota > 5) {
            int i = 0;
            i = 1;
            i++;
        }System.out.println("Número de aprobados: " );


        for (int i = 0; nota > 5; i++){
        }System.out.println("Número de aprobados: " + nota);

        for (int i = 0; nota < 5; i++){
             nota = i;
        }System.out.println("Número de suspensos: " + nota);

        media = nota;
        System.out.println("Media de notas: "+ media);



    }
}
