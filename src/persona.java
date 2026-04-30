public class persona {
    String nombre;
    int edad;
    String genero;
    String identificacion;

    public persona(String nombre, int edad, String genero, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
    }
    public void mostrarDatos() {
        System.out.println("---DATOS PERSONALES---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Identificacion: " + identificacion);

    }

}



