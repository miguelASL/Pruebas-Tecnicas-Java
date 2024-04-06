package Pruebas.Variados;

/*
Construir un programa que dada una serie de vehiculos, nos indique cuál es el más barato. Para ello, se solicitará por
teclado la marca, modelo y precio de cada uno de los vehiculos y estos se guardarán en un array de tipo Vehiculo.
Al final, el programa mostrará los datos del vehiculo más barato. Para ello, se debe crear la clase Vehiculo con los
atributos y métodos que se crean convenientes.
*/
public class Vehiculos {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    public String mostrarDatos(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio;
    }
}
