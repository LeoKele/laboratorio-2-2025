package ar.edu.unlu.poo.labo2.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String unNombre, int cantidadDePoder, String unTipo) {
        nombre = unNombre;
        poder = cantidadDePoder;
        tipo = unTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelDePoder() {
        return poder;
    }


    public int getPoder (){
        return this.poder;
    }

    public void setPoder(int poder){
        this.poder= poder;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // misma instancia
        if (o == null || getClass() != o.getClass()) return false; // nulo o tipo distinto
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public String getTipo() {
        return tipo;
    }
}