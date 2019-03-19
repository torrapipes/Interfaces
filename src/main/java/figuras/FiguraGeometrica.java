package figuras;

import drawable.Drawable;

public abstract class FiguraGeometrica implements Drawable {


    // Atributos

    private String nombre = null;


    // Constructores

    public FiguraGeometrica() {
        this.nombre = "Desconocido";
    }


    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }


    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Getters

    public String getNombre() {
        return nombre;
    }


    // OCP

    public abstract double area();


}
