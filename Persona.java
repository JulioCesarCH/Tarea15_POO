package Tarea15;

public abstract  class Persona {
    protected int dni;
    protected String nombres;
    protected String apellidos;

    public Persona(int dni, String nombres, String apellidos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    protected int getDni() {
        return dni;
    }

    protected void setDni(int dni) {
        this.dni = dni;
    }

    protected String getNombres() {
        return nombres;
    }

    protected void setNombres(String nombres) {
        this.nombres = nombres;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
