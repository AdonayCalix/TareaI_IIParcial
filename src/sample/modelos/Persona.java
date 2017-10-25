package sample.modelos;


public class Persona {

    public String nombre;
    public String apellido;
    public int edad;

    private static Persona[] personas = {
            //Debes de cambiar estos datos y poner otros
            new Persona("David", "Delcid", 20),
            new Persona("David", "Martinez", 20),
            new Persona("Tulio", "Garcia", 21),
            new Persona("Oscar", "Diaz", 23),
            new Persona("Allaster", "Aragon", 24),
            new Persona("Yarince", "Padilla", 21),
            new Persona("Felix", "Peralta", 22),

    };

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static Persona buscarPorPosicion(int posicion){
        if(posicion >= personas.length){
            return personas[posicion];
        }
        return null;
    }


}




