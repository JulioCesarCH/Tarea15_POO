package Tarea15;

public class Alumno extends Persona {
    private String idAlumno;
    public Alumno(String idAlumno,int dni, String nombres, String apellidos) {

        super(dni,nombres,apellidos);
        this.idAlumno = idAlumno;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

}
