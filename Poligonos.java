package Pruebas.Variados;

public abstract class Poligonos {
    protected int numeroLados;

    public Poligonos(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "NumeroLados= " + numeroLados +
                '}';
    }

    // Método abstracto
    public abstract double area();
}
