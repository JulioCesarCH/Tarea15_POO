package Tarea15;

public class AlumnoController {
    private Alumno alumno[];
    private String idAlu;
    private int dniAlu;
    private String nombresAlu;
    private String apellidosAlu;

    private int contador;

    public AlumnoController(int size)
    {
        this.alumno = new Alumno[size];

        this.contador = 0;
    }

    public void agregarAlumno(String idAlumno,int dni, String nombres, String apellidos)
    {
        this.alumno[this.contador] = new Alumno(idAlumno,dni,nombres,apellidos);

        this.contador++;
    }

    public Alumno buscarAlumno(String idAlumno)
    {
        int i;
        i=0;
        while (i<this.contador)
        {
            if(this.alumno[i].getIdAlumno()==idAlumno)
            {
                break;
            }
            i++;
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.alumno[i];
        }
    }

    public Alumno[] listarAlumno()
    {
        return this.alumno;
    }

    public Alumno editarAlumno(String idAlumno,int dniNew,String nombresNew,String apellidosNew)
    {
        int j;
        j=0;
        while (j<this.contador)
        {
            if(this.alumno[j].getIdAlumno()==idAlumno)
            {
                this.setIdAlu(this.alumno[j].getIdAlumno());
                this.setDniAlu(this.alumno[j].getDni());
                this.setNombresAlu(this.alumno[j].getNombres());
                this.setApellidosAlu(this.alumno[j].getApellidos());
                this.alumno[j].setDni(dniNew);
                this.alumno[j].setNombres(nombresNew);
                this.alumno[j].setApellidos(apellidosNew);
                break;
            }
            j++;
        }
        return this.alumno[j];
    }

    public Alumno eliminarAlumno(String idAlumno)
    {
        int k,bn,ps;
        k=0;
        bn=0;
        ps=0;
        while (k<this.contador)
        {
            if(this.alumno[k].getIdAlumno()==idAlumno)
            {
                ps=k;
                bn=1;
                this.setIdAlu(this.alumno[k].getIdAlumno());
                this.setDniAlu(this.alumno[k].getDni());
                this.setNombresAlu(this.alumno[k].getNombres());
                this.setApellidosAlu(this.alumno[k].getApellidos());
                break;
            }
            k++;
        }
        if (bn==1){
            if (ps==this.contador)
            {
                this.contador=this.contador-1;
            }
            else
            {
                for(int i=ps;i<(this.contador-1);i++)
                {
                    this.alumno[i] = this.alumno[i+1];
                }
                this.contador=this.contador-1;
            }
            return this.alumno[ps];
        }
        else
        {
            return null;
        }
    }

    public String getIdAlu() {
        return idAlu;
    }

    public void setIdAlu(String idAlu) {
        this.idAlu = idAlu;
    }

    public int getDniAlu() {
        return dniAlu;
    }

    public void setDniAlu(int dniAlu) {
        this.dniAlu = dniAlu;
    }

    public String getNombresAlu() {
        return nombresAlu;
    }

    public void setNombresAlu(String nombresAlu) {
        this.nombresAlu = nombresAlu;
    }

    public String getApellidosAlu() {
        return apellidosAlu;
    }

    public void setApellidosAlu(String apellidosAlu) {
        this.apellidosAlu = apellidosAlu;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
