/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicionro3_carvajalgarciaalvaroandres;

/**
 *
 * @author alvar
 */
public class Mermelada {
    private final int capacidadFrasco; // T
    private final int gramosPorFruta;  // M
    private int acumulado;

    public Mermelada(int capacidadFrasco, int gramosPorFruta) {
        this.capacidadFrasco = capacidadFrasco;
        this.gramosPorFruta = gramosPorFruta;
        this.acumulado = 0;
    }

    public int procesarDia(int frutas) {
        int gramos = frutas * gramosPorFruta;
        acumulado += gramos;

        int frascos = acumulado / capacidadFrasco;
        acumulado = acumulado % capacidadFrasco;

        return frascos;
    }

    public int getRestante() {
        return acumulado;
    }
}
