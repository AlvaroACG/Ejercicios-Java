/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentadeck;

/**
 *
 * @author alvar
 */
public class Deck {
    
    private int idDeck;
    private String arquetipo;
    private int core;
    private int staple;
    private String protector;
    private int totalProtectores;
    private int totalCartas;

    // Constructor vacío requerido para instanciar el objeto antes de asignarle valores.
    public Deck() {
    }

    // Constructor completo para inicializar el objeto con todos sus datos de una sola vez.
    public Deck(int idDeck, String arquetipo, int core, int staple, String protector, int totalProtectores, int totalCartas) {
        this.idDeck = idDeck;
        this.arquetipo = arquetipo;
        this.core = core;
        this.staple = staple;
        this.protector = protector;
        this.totalProtectores = totalProtectores;
        this.totalCartas = totalCartas;
    }

    // Método de negocio que calcula el total de cartas sumando el motor principal y las genéricas.
    // Este método debe ejecutarse primero para establecer el valor de la variable totalCartas.
    public void calcularTotalCartas() {
        this.totalCartas = this.core + this.staple;
    }

    // Método de negocio que valida si la suma de cartas cumple con el formato estándar.
    // Retorna true si el mazo tiene entre 40 y 60 cartas en total evaluando el atributo calculado.
    public boolean validarTamanoLegal() {
        
        if (this.totalCartas >= 40 && this.totalCartas <= 60) {
            return true;
        } else {
            return false;
        }
    }

    // Método de negocio que calcula la cantidad de fundas necesarias según el tipo seleccionado.
    // Multiplica el atributo total de cartas por dos exclusivamente si detecta la palabra clave para doble folio.
    public void calcularTotalProtectores() {
        if (this.protector != null && this.protector.equals("Protector Doble")) {
            this.totalProtectores = this.totalCartas * 2;
        } else {
            this.totalProtectores = this.totalCartas;
        }
    }

    // Devuelve el número identificador único de la base de datos.
    public int getIdDeck() {
        return idDeck;
    }

    // Asigna el número identificador único proveniente de la base de datos.
    public void setIdDeck(int idDeck) {
        this.idDeck = idDeck;
    }

    // Devuelve el nombre de la estrategia guardada en el objeto.
    public String getArquetipo() {
        return arquetipo;
    }

    // Asigna el nombre de la estrategia al objeto.
    public void setArquetipo(String arquetipo) {
        this.arquetipo = arquetipo;
    }

    // Devuelve la cantidad de cartas del motor principal.
    public int getCore() {
        return core;
    }

    // Asigna la cantidad de cartas del motor principal al objeto.
    public void setCore(int core) {
        this.core = core;
    }

    // Devuelve la cantidad de cartas genéricas del mazo.
    public int getStaple() {
        return staple;
    }

    // Asigna la cantidad de cartas genéricas al objeto.
    public void setStaple(int staple) {
        this.staple = staple;
    }

    // Devuelve el tipo de protector seleccionado desde la interfaz.
    public String getProtector() {
        return protector;
    }

    // Asigna el tipo de protector para que pueda ser evaluado en el cálculo matemático.
    public void setProtector(String protector) {
        this.protector = protector;
    }

    // Devuelve el total matemático de protectores ya calculado.
    public int getTotalProtectores() {
        return totalProtectores;
    }

    // Permite asignar manualmente el total de protectores si se extrae directo desde MySQL.
    public void setTotalProtectores(int totalProtectores) {
        this.totalProtectores = totalProtectores;
    }

    // Devuelve la sumatoria de las cartas del mazo.
    public int getTotalCartas() {
        return totalCartas;
    }

    // Permite asignar manualmente el total de cartas si se extrae directo desde MySQL.
    public void setTotalCartas(int totalCartas) {
        this.totalCartas = totalCartas;
    }
}