package sample.Modelos;

public class Persona {

    public String nombre;
    public String apellido;
    public int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static Persona[] personas = {
            new Persona("David", "Delcid", 20),
            new Persona("Luis", "Galvez", 22),
            new Persona("Victoria", "Cruz", 24),
            new Persona("Oscar", "Diaz", 23),
            new Persona("Allaster", "Aragon", 24),
            new Persona("Jonan", "Padilla", 21),
            new Persona("Marcos", "Murrillo", 27),
    };

    public static Persona buscarPorPosicion(int posicion) {
        if (posicion >= personas.length) {
            return personas[posicion];
        }
        return null;
    }

    public static Persona buscarPorNombre(String nombreBuscar) {

        int contador = 0;

        for (int i = 0; i < personas.length; i++) {
            if (nombreBuscar.equals(personas[i].nombre)) {
                System.out.println("Se encontro: " + personas[i].nombre + " " + personas[i].apellido);
                return personas[i];
            }
        }

        return null;
    }


}
