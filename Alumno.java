

/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Alumno.
 * 
 * @author Jeison Ferrer Ortega 115200 (https://github.com/joferrer/Universidad)
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Alumno
{
    protected String codigo;
    protected String nombres;
    protected String apellidos;
    protected int edad;
    protected float promedio;

    public Alumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        //COMPLETE
        this.codigo=codigo;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.edad=edad;
        this.promedio=promedio;
    }//fin constructor

    public boolean tienePromedioCondicional(){
        //COMPLETE
        
        return this.promedio<=3.1&&this.promedio>=2;
    }

    /**Metodo de acceso a la propiedad codigo*/
    public String getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**Metodo de modificacion a la propiedad codigo*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**Metodo de acceso a la propiedad nombres*/
    public String getNombres(){
        return this.nombres;
    }//end method getNombres

    /**Metodo de modificacion a la propiedad nombres*/
    public void setNombres(String nombres){
        this.nombres = nombres;
    }//end method setNombres

    /**Metodo de acceso a la propiedad apellidos*/
    public String getApellidos(){
        return this.apellidos;
    }//end method getApellidos

    /**Metodo de modificacion a la propiedad apellidos*/
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }//end method setApellidos

    /**Metodo de acceso a la propiedad edad*/
    public int getEdad(){
        return this.edad;
    }//end method getEdad

    /**Metodo de modificacion a la propiedad edad*/
    public void setEdad(int edad){
        this.edad = edad;
    }//end method setEdad

    /**Metodo de acceso a la propiedad promedio*/
    public float getPromedio(){
        return this.promedio;
    }//end method getEdad

    /**Metodo de modificacion a la propiedad promedio*/
    public void setPromedio(float promedio){
        this.promedio = promedio;
    }//end method setEdad

    /**Compara el codigo de this con un String u otro Alumno*/
    public boolean equals(Object other)
    {
        //COMPLETE
        boolean iguales=false;
        if(other.getClass().getName().equals("Alumno")){
            Alumno otro= (Alumno)other;
            iguales=this.codigo.equals(otro.getCodigo())||(this.nombres.equals(otro.getNombres())
            &&this.apellidos.equals(otro.getApellidos()));
        }
        else iguales=other.equals(this.getCodigo());
        return iguales;
    }//fin equals

}//fin class Alumno