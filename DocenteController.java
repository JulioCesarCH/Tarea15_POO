package Tarea15;

public class DocenteController {
    private Docente docente[];
    private int dniDoc;
    private String nombresDoc;
    private String apellidosDoc;
    private int contador;

    public DocenteController(int size)
    {
        this.docente = new Docente[size];

        this.contador = 0;
    }

    public void agregarDocente(int dni, String nombres, String apellidos)
    {
        this.docente[this.contador] = new Docente(dni, nombres,apellidos);

        this.contador++;
    }

    public Docente buscarDocente(int dni)
    {
        int i;
        i=0;
        while (i<this.contador)
        {
            if(this.docente[i].getDni()==dni)
            {
                break;
            }
            i++;
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.docente[i];
        }
    }

    public Docente[] listarDocente()
    {
        return this.docente;
    }

    public Docente editarDocente(int dni,String nombresNew,String apellidosNew)
    {
        int j;
        j=0;
        while (j<this.contador)
        {
            if(this.docente[j].getDni()==dni)
            {
                this.setDniDoc(this.docente[j].getDni());
                this.setNombresDoc(this.docente[j].getNombres());
                this.setApellidosDoc(this.docente[j].getApellidos());
                this.docente[j].setNombres(nombresNew);
                this.docente[j].setApellidos(apellidosNew);
                break;
            }
            j++;
        }
        return this.docente[j];
    }

    public Docente eliminarDocente(int dni)
    {
        int k,bn,ps;
        k=0;
        bn=0;
        ps=0;
        while (k<this.contador)
        {
            if(this.docente[k].getDni()==dni)
            {
                ps=k;
                bn=1;
                this.setDniDoc(this.docente[k].getDni());
                this.setNombresDoc(this.docente[k].getNombres());
                this.setApellidosDoc(this.docente[k].getApellidos());
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
                    this.docente[i] = this.docente[i+1];
                }
                this.contador=this.contador-1;
            }
            return this.docente[ps];
        }
        else
        {
            return null;
        }
    }

    public String getNombresDoc() {
        return nombresDoc;
    }

    public void setNombresDoc(String nombresDoc) {
        this.nombresDoc = nombresDoc;
    }

    public String getApellidosDoc() {
        return apellidosDoc;
    }

    public void setApellidosDoc(String apellidosDoc) {
        this.apellidosDoc = apellidosDoc;
    }

    public int getDniDoc() {
        return dniDoc;
    }

    public void setDniDoc(int dniDoc) {
        this.dniDoc = dniDoc;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
