package figuras;

public class Elipse extends FiguraGeometrica {


    // Atributos

    private double semiEjeMayor = 0d;
    private double semiEjeMenor = 0d;
    private final double PI = Math.PI;


    // Constructores

    public Elipse() {
        super();
    }


    public Elipse(double semiEjeMayor, double semiEjeMenor) {
        super();
        this.semiEjeMayor = semiEjeMayor;
        this.semiEjeMenor = semiEjeMenor;
    }


    public Elipse(String nombre, double semiEjeMayor, double semiEjeMenor) {
        super(nombre);
        this.semiEjeMayor = semiEjeMayor;
        this.semiEjeMenor = semiEjeMenor;
    }


    // Setters

    public void setSemiEjeMayor(double semiEjeMayor) {
        this.semiEjeMayor = semiEjeMayor;
    }


    public void setSemiEjeMenor(double semiEjeMenor) {
        this.semiEjeMenor = semiEjeMenor;
    }


    // Getters

    public double getSemiEjeMayor() {
        return semiEjeMayor;
    }


    public double getSemiEjeMenor() {
        return semiEjeMenor;
    }


    // Metodos


    @Override
    public double area() {
        return PI * getSemiEjeMayor() * getSemiEjeMenor();
    }


}
