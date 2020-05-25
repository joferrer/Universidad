 


/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Inscripcion.
 * 
 * @author Jeison Ferrer Ortega 115200 (https://github.com/joferrer/Universidad)
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Inscripcion
{
  protected Alumno alumno;
  protected Materia materia;
  
  public Inscripcion(Alumno alumno, Materia materia)
  {
    //COMPLETE
    this.alumno =alumno;
    this.materia=materia;
  }//fin constructor
  
    /**Metodo de acceso a la propiedad alumno*/
    public Alumno getAlumno(){
        return this.alumno;
    }//end method getAlumno
    
    public Materia getMateria(){
        return this.materia;
    }
    
    /**Compara el Materia y alumno de this con el Materia y Alumno de other*/
    public boolean equals(Object other)
    {
      //COMPLETE
      Inscripcion otro = (Inscripcion)other;
      boolean iguales= otro.getAlumno().equals(this.alumno)
      &&otro.getMateria().equals(this.getMateria());
      return iguales;
    }//fin equals    

}//fin class Inscripcion