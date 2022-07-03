package Tarea15;
public class MainDocente {
    public static void main(String args[])
    {
        DocenteController docenteController = new DocenteController(3);

        docenteController.agregarDocente(12345678, "Juan","Flores");
        docenteController.agregarDocente(64523725,"Edgardo", "Ramirez");
        docenteController.agregarDocente(89564824,"Alejandra", "leon");

        System.out.println("------------- Lista de Docentes Registrados-------------");
        for(Docente d : docenteController.listarDocente())
        {
            System.out.println("DNI: "+ d.getDni());
            System.out.println("Nombres: "+ d.getNombres());
            System.out.println("Apellidos: "+ d.getApellidos());
        }

        System.out.println("------------- Buscar Docente -------------");

        System.out.println("DNI de Docente Buscado: 12345678 ");

        int docente = 12345678;

        Docente encontrado;

        encontrado = docenteController.buscarDocente(docente);

        if(encontrado != null)
        {
            System.out.println("Docente encontrado: ---------------------");
            System.out.println("DNI: "+ encontrado.getDni());
            System.out.println("Nombres: "+ encontrado.getNombres());
            System.out.println("Apellidos: "+ encontrado.getApellidos());

        } else {

            System.out.println("No se encontro el Docente con DNI: "+docente);
        }

        System.out.println("------------- Editar Docente -------------");
        System.out.println("DNI de Docente a Editar: 64523725 ");
        int docenteE = 64523725;
        docenteController.editarDocente(docenteE,"Edgardo Abel","Ramirez Morales");
        System.out.println("DNI: "+ docenteController.getDniDoc());
        System.out.println("Nombres: "+ docenteController.getNombresDoc());
        System.out.println("Apellidos: "+ docenteController.getApellidosDoc());

        Docente modificado;
        modificado = docenteController.editarDocente(docenteE,"Edgardo Abel","Ramirez Morales");

        System.out.println("Docente Editado: ---------------------");
        System.out.println("DNI: "+ modificado.getDni());
        System.out.println("Nombres: "+ modificado.getNombres());
        System.out.println("Apellidos: "+ modificado.getApellidos());

        System.out.println("------------- Eliminar Docente -------------");
        System.out.println("Codigo Docente a Eliminar: 89564824 ");

        int docenteD = 89564824;

        docenteController.eliminarDocente(docenteD);

        System.out.println("Docente Eliminado: ---------------------");
        System.out.println("DNI: "+ docenteController.getDniDoc());
        System.out.println("Nombres: "+ docenteController.getNombresDoc());
        System.out.println("Apellidos: "+ docenteController.getApellidosDoc());

        System.out.println("------------- Lista de Docentes Actualizados -------------");
        docenteController.listarDocente();

    }
}
