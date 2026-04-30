class doctor extends persona{
    String especialidad;
    String numLicencia;

    public doctor(String nombre, int edad, String genero, String identificacion, String especialidad, String numLicencia) {
        super(nombre, edad, genero, identificacion);
        this.especialidad = especialidad;
        this.numLicencia = numLicencia;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("----Datos del Doctor----");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Numero de Licencia: " + numLicencia);
    }
    public void agregarPaciente(String nombrePaciente) {
        System.out.println("El dr. " +nombre + " ha registrado a: " + nombrePaciente);

    }

}