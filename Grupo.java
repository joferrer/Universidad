 

import java.util.ArrayList;

/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Grupo.
 * 
 * @author Jeison Ferrer Ortega 115200 (https://github.com/joferrer/Universidad)
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Grupo
{
  protected Alumno[] alumnos;
  protected Materia materia;
  protected int contadorDeAlumnos;
  
  public Grupo(Materia materia)
  {
      this.materia= materia;
      alumnos= new Alumno[materia.getMaximoDeAlumnosPorGrupo()];
      
    //COMPLETE
  }//fin construuctor
  
  public boolean agregarAlumno(Alumno alumno)
  {
    boolean puedeAgregar = false;
    if(contadorDeAlumnos<alumnos.length&&!contieneAlumno(alumno)){
        alumnos[contadorDeAlumnos]=alumno;
        contadorDeAlumnos++;
        puedeAgregar=true;
    }
    //COMPLETE
    return puedeAgregar;
  }//fin agregarAlumno
  
  public boolean contieneAlumno(Alumno alumno){
    boolean rta = false; 
    for(Alumno x :this.alumnos){
    
        if(x!=null&&x.equals(alumno))
        {
            rta=true;
            break;
        }
    }
    //COMPLETE
    return rta;
  }
  
    /**Metodo de modificacion a la propiedad contadorDeAlumnos*/
    public void setContadorDeAlumnos(int contadorDeAlumnos){
        this.contadorDeAlumnos = contadorDeAlumnos;
    }//end method setContadorDeAlumnos

    /**Metodo de acceso a la propiedad contadorDeAlumnos*/
    public int getContadorDeAlumnos(){
        return this.contadorDeAlumnos;
    }//end method getContadorDeAlumnos


}//fin class Grupo