package Tarea15;

public class MainAlumno {
    public static void main(String args[])
    {
        AlumnoController alumnoController = new AlumnoController(3);

        alumnoController.agregarAlumno("012020",12345678, "Francis","Mattos");
        alumnoController.agregarAlumno("012018",64523725,"Julio", "Cueva");
        alumnoController.agregarAlumno("012019",89564824,"Brenda", "Caballero");

        System.out.println("------------- Lista de Alumnos Registrados-------------");
        for(Alumno a : alumnoController.listarAlumno())
        {
            System.out.println("Codigo: "+ a.getIdAlumno());
            System.out.println("DNI: "+ a.getDni());
            System.out.println("Nombres: "+ a.getNombres());
            System.out.println("Apellidos: "+ a.getApellidos());
        }

        System.out.println("------------- Buscar Alumno -------------");

        System.out.println("Codigo de Alumno Buscado: 012019 ");

        String alumno = "012019";

        Alumno encontrado;

        encontrado = alumnoController.buscarAlumno(alumno);

        if(encontrado != null)
        {
            System.out.println("Alumno encontrado: ---------------------");
            System.out.println("Codigo: "+ encontrado.getIdAlumno());
            System.out.println("DNI: "+ encontrado.getDni());
            System.out.println("Nombres: "+ encontrado.getNombres());
            System.out.println("Apellidos: "+ encontrado.getApellidos());

        } else {

            System.out.println("No se encontro el Alumno con Codigo: "+alumno);
        }

        System.out.println("------------- Editar Alumno -------------");
        System.out.println("Codigo de Alumno a Editar: 012018 ");
        String alumnoE = "012018";
        alumnoController.editarAlumno(alumnoE,64523725,"Julio Cesar","Cueva Huerto");
        System.out.println("Codigo: "+ alumnoController.getIdAlu());
        System.out.println("DNI: "+ alumnoController.getDniAlu());
        System.out.println("Nombres: "+ alumnoController.getNombresAlu());
        System.out.println("Apellidos: "+ alumnoController.getApellidosAlu());

        Alumno modificado;
        modificado = alumnoController.editarAlumno(alumnoE,64523725,"Julio Cesar","Cueva Huerto");

        System.out.println("Alumno Editado: ---------------------");
        System.out.println("Codigo: "+ modificado.getIdAlumno());
        System.out.println("DNI: "+ modificado.getDni());
        System.out.println("Nombres: "+ modificado.getNombres());
        System.out.println("Apellidos: "+ modificado.getApellidos());

        System.out.println("------------- Eliminar Alumno -------------");
        System.out.println("Codigo Alumno a Eliminar: 012020 ");

        String alumnoD = "012020";

        alumnoController.eliminarAlumno(alumnoD);

        System.out.println("Alumno Eliminado: ---------------------");
        System.out.println("Codigo: "+ alumnoController.getIdAlu());
        System.out.println("DNI: "+ alumnoController.getDniAlu());
        System.out.println("Nombres: "+ alumnoController.getNombresAlu());
        System.out.println("Apellidos: "+ alumnoController.getApellidosAlu());

        System.out.println("------------- Lista de Alumnos Actualizados -------------");
        alumnoController.listarAlumno();

    }
}
