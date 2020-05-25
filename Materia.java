 

import java.util.ArrayList;

/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Materia.
 * 
 * @author Jeison Ferrer Ortega 115200 (https://github.com/joferrer/Universidad)
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Materia
{
    protected ArrayList<Grupo> grupos;
    protected ArrayList<Inscripcion> inscripciones;
    protected String nombre;
    protected int maximoDeAlumnosPorGrupo;
  
    public Materia(String nombre, int maximoDeAlumnosPorGrupo)
    {
      //COMPLETE
      this.nombre = nombre;
      this.maximoDeAlumnosPorGrupo=maximoDeAlumnosPorGrupo;
      
      this.inscripciones= new ArrayList();
    }//fin constructor
    
    public boolean inscribir(Alumno alumno)
    {
      boolean inscribio = false;
    
      inscribio= !alumno.tienePromedioCondicional()&&!estaInscrito(alumno);
      if(inscribio)inscripciones.add(new Inscripcion (alumno,this));
      //COMPLETE
      return inscribio;
    }//fin inscribir
    
    public int generarGrupos()
    {
       this.grupos= new ArrayList();
      int totalGrupos = 0;
      totalGrupos= inscripciones.size()/this.maximoDeAlumnosPorGrupo;
      int cont=0; //Guarda la ultima inscripción que se agregó
      
      for(int i=0;i<totalGrupos;i++){
          Grupo grup=new Grupo(this);
          for(int j=0;j<maximoDeAlumnosPorGrupo;j++){
              grup.agregarAlumno(inscripciones.get(cont).getAlumno());
              cont++;
          }
          grupos.add(grup);
      }
      //COMPLETE      
      return totalGrupos;
      
    }//fin generarGrupos
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificacion a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad maximoDeAlumnosPorGrupo*/
    public int getMaximoDeAlumnosPorGrupo(){
        return this.maximoDeAlumnosPorGrupo;
    }//end method getMaximoDeAlumnosPorGrupo

    /**Metodo de modificacion a la propiedad maximoDeAlumnosPorGrupo*/
    public void setMaximoDeAlumnosPorGrupo(int maximoDeAlumnosPorGrupo){
        this.maximoDeAlumnosPorGrupo = maximoDeAlumnosPorGrupo;
    }//end method setMaximoDeAlumnosPorGrupo

    /***/
    public Grupo getGrupo(int numero)
    {
      return this.grupos.get(numero);
    }//fin getGrupo
    
    /**Compara el nombre de this con un String u otro Materia*/
    public boolean equals(Object other)
    {
      //COMPLETE
      boolean iguales=false;    
          Materia otra = (Materia)other; 
          iguales= this.nombre.equals(otra.getNombre());   
      return iguales;
  
    }//fin equals
    /** 
     * Este metodo verifica si un alumno ya estaba incrito en la materia.
    */
    public boolean estaInscrito(Alumno alumno){
        boolean yaEsta=false;
        for(int i=0;i<this.inscripciones.size();i++){
            if(this.inscripciones.get(i).alumno.equals(alumno)) {
                yaEsta=true;
                break;
            }
        }
        return yaEsta;
    }
    /**
     * Metodo recursivo que halla el maximo común divisor entre dos numeros enteros 
     */
    public int mcd(int i, int j){
        if(j==0) return i;
        else return mcd(j,i%j);
    }

}//fin class Materia