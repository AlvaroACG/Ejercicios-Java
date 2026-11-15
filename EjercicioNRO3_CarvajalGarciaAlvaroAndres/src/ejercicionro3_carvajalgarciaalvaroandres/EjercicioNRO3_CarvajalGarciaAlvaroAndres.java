/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionro3_carvajalgarciaalvaroandres;

/**
 *
 * @author alvar
 */
import java.util.Scanner;
public class EjercicioNRO3_CarvajalGarciaAlvaroAndres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T, M;

        // Leer T
        while (true) {
            T = sc.nextInt();
            if (T > 0 && T <= 1000) break;
            System.out.println("Error, valor fuera de rango");
        }

        // Leer M
        while (true) {
            M = sc.nextInt();
            if (M >= 0 && M <= 200) break;
            System.out.println("Error, valor fuera de rango");
        }

        int[] datos = new int[1000];
        int n = 0;

        // Guardar entradas
        while (true) {
            int x = sc.nextInt();

            if (x == -1) break;

            if (x <= 0) {
                System.out.println("Error, valor fuera de rango");
                continue;
            }

            datos[n++] = x;
        }

        int acumulado = 0;

        // Procesar y mostrar después
        for (int i = 0; i < n; i++) {
            acumulado += datos[i] * M;

            int frascos = acumulado / T;
            acumulado = acumulado % T;

            System.out.println(frascos);
        }

        // restante final
        System.out.println(acumulado);

        // frascos usando SOLO el último ingreso + el sobrante
        int ultimo = datos[n - 1] * M;
        int frascosFinal = (acumulado + ultimo) / T;

        System.out.println(frascosFinal);
    }
}