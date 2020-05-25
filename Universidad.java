
import java.util.ArrayList;
/**
 * Escriba en lenguaje natural una descripcion de los objetos
 * que caben en el concepto de la clase Universidad.
 * 
 * @author Jeison Ferrer Ortega 115200 (https://github.com/joferrer/Universidad)
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class Universidad
{
    public static final int MAX_ALUMNOS = 100;
    public static final int MAX_MATERIAS = 10;
    protected Materia [] materias;
    protected Alumno [] alumnos;
    protected int contadorMaterias;
    protected int contadorAlumnos;

    public Universidad()
    {
        //COMPLETE
        materias= new Materia[MAX_MATERIAS];
        alumnos= new Alumno[MAX_ALUMNOS];

    }//fin constructor

    public boolean agregarMateria(String nombre, int maximoDeAlumnosPorGrupo)
    {
        boolean agrego = false;

        Materia agregar= new Materia(nombre,maximoDeAlumnosPorGrupo);
        if(!contieneMateria(agregar)&&contadorMaterias!=materias.length){
            materias[contadorMaterias]=agregar;
            contadorMaterias++;
            agrego=true;
                  
        }

        //COMPLETE
        return agrego;
    }//fin agregarMateria

    public boolean contieneMateria(Materia materia){
        boolean existe = false;

        for(int i=0;i<materias.length;i++){
            if(materias[i]!=null&&materias[i].equals(materia))existe=true;
        }    

        //COMPLETE
        return existe;
    }

    public boolean agregarAlumno(String codigo, String nombres, String apellidos, int edad, float promedio)
    {
        boolean agrego = false;
        Alumno nuevo = new Alumno(codigo,nombres,apellidos,edad,promedio);
        if(!contieneAlumno(nuevo)&&contadorAlumnos!=alumnos.length){   
            alumnos[contadorAlumnos]=nuevo;
            contadorAlumnos++;
            agrego=true;
                         
        }
        //COMPLETE
        return agrego;
    }//fin agregarAlumno

    public boolean contieneAlumno(Alumno alumno){
        boolean existe = false;
        for(int i=0;i<this.alumnos.length;i++){
            if(this.alumnos[i]!=null&&this.alumnos[i].equals(alumno)){
                existe=true;
                break; 
            }                
        }
        //COMPLETE
        return existe;
    }

    /**Regresa el alumno en la posicion numero o null si no existe*/
    public Alumno getAlumno(int numero)
    {
        try{
        return this.alumnos[numero-1];}
        catch(Exception e) {return null;}
    }//fin getAlumno

    /**Regresa el Materia en la posicion numero o null si no existe*/
    public Materia getMateria(int numero)
    {
        //COMPLETE
        try{
        return this.materias[numero-1];}
        catch(Exception e) {return null;}
    }//fin getMateria   

    /**
     * Elimina el alumno en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Alumno eliminarAlumno(int numero){
        //COMPLETE
        Alumno eliminar=getAlumno(numero);
        
        if(numero>contadorAlumnos) eliminar=null;
        if(eliminar!=null){this.alumnos[numero-1]=null;
           
            reacomodar(alumnos,numero-1);
            contadorAlumnos--;
        }
        return eliminar;
    }

    /**
     * Elimina la materia en la posicion numero.
     * Regresa el objeto eliminado si existe o NULL si no existe.
     * Reacomoda el arreglo para que todos los elementos queden contiguos y no queden vacios
     */
    public Materia eliminarMateria(int numero){
        //COMPLETE
        
        Materia eliminar = getMateria(numero);
        if(numero>contadorMaterias) eliminar=null;
        if(eliminar!=null){
            this.materias[numero-1]=null;
            
            reacomodar(materias, numero-1);
            contadorMaterias--;
            
        }
        
        return eliminar;
    }

    public void reacomodar(Object lista[],int pos){
        Object ant = new Object();
        int contador=0;
        if(lista.getClass().getComponentType().getName()=="Materia")
        contador=contadorMaterias;
        else if (lista.getClass().getComponentType().getName()=="Alumno")contador=contadorAlumnos;
        
        if(pos+1==contador)lista[pos]=null;
        for(int i=pos+1;i<contador;i++){
            ant = lista[i];
            lista[i-1]=ant;           
        }
       /* for(int i=pos;i<lista.length;i++){
            if(i+1<lista.length-1){
                Object copia= lista[i+1];
                lista[i]=copia;
            }
            else if (i==lista.length-1) lista[i]=null;

        }*/
    }

}//fin class Universidad